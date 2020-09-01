package com.innovativeintelli.ldapauthenticationjwttoken.models;

import lombok.Data;

import java.io.Serializable;

@Data
public class Configs implements Serializable {

    private String value;
    private String name;
    private int id;

    public Configs(int id,String value, String name) {
        this.id = id;
        this.value = value;
        this.name = name;
    }
}
