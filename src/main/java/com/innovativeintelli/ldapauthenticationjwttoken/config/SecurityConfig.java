package com.innovativeintelli.ldapauthenticationjwttoken.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.innovativeintelli.ldapauthenticationjwttoken.security.JwtFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.LdapShaPasswordEncoder;
import org.springframework.security.ldap.DefaultSpringSecurityContextSource;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.http.HttpServletResponse;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(
        securedEnabled = true,
        jsr250Enabled = true,
        prePostEnabled = true
)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private JwtFilter jwtFilter;


	  @Override
	    protected void configure(HttpSecurity http) throws Exception {
	        http.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class)
	        		.cors().and().csrf()
	        			.disable()
	                .authorizeRequests()
	                    .antMatchers("/jiokolee/api/auth/**").permitAll()
	                    .anyRequest().authenticated().and().exceptionHandling().authenticationEntryPoint((request, response, e) -> {
				ObjectMapper mapper = new ObjectMapper();
				Map<String, String> map = new HashMap<>();
				map.put("code", "401");
				map.put("message", "Access denied due to missing access token. Make sure to include access token when making requests to the API.");
				response.setContentType("application/json;charset=UTF-8");
				response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
				response.getWriter().write(mapper.writeValueAsString(map));
			}).and()
				  .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);;

	    }

	    @Override
	    public void configure(AuthenticationManagerBuilder auth) throws Exception {
	    	//Good to use BcryptEncoder for spring 5.0
	        auth
	                .ldapAuthentication()
	                    .userDnPatterns("uid={0},ou=people")
	                    .groupSearchBase("ou=groups")
	                .contextSource(contextSource())
	                .passwordCompare()
	                    .passwordEncoder(new LdapShaPasswordEncoder())
	                    .passwordAttribute("userPassword");
	    }



    @Bean(BeanIds.AUTHENTICATION_MANAGER)
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Bean
    public DefaultSpringSecurityContextSource contextSource() {
        return  new DefaultSpringSecurityContextSource(
                Collections.singletonList("ldap://localhost:12345"), "dc=innovativeintelli,dc=com");
    }


}