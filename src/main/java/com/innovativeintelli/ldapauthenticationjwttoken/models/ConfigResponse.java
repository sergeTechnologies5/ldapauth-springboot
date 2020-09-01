package com.innovativeintelli.ldapauthenticationjwttoken.models;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ConfigResponse implements Serializable {
    private String responseCode;
    private List<Configs> configurations;

}
