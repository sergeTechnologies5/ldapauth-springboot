package com.innovativeintelli.ldapauthenticationjwttoken.models;

import lombok.Data;

import java.util.List;

@Data
public class RepaidResponse {
    private String responseCode;
    private String responseDescription;
    private List<RepaidLoan> loansRepaid;
}
