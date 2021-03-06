package com.innovativeintelli.ldapauthenticationjwttoken;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.annotation.PostConstruct;
import java.util.TimeZone;


@SpringBootApplication
@EntityScan(basePackageClasses = {LDAPAuthenticationJWTTokenApplication.class})
public class LDAPAuthenticationJWTTokenApplication {

    @PostConstruct
    void init() {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
    }

    public static void main(String[] args) {
        SpringApplication.run(LDAPAuthenticationJWTTokenApplication.class, args);
    }
}
