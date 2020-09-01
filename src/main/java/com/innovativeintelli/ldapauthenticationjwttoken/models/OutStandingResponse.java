package com.innovativeintelli.ldapauthenticationjwttoken.models;

import lombok.Data;

import java.util.List;

@Data
public class OutStandingResponse {
    private String responseCode;
    private String responseDescription;
    private List<OutStandingLoan> loans;
}
