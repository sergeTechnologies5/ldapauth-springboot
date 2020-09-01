package com.innovativeintelli.ldapauthenticationjwttoken.models;

import lombok.Data;

@Data
public class LoanBorrowed {
    private String id;
    private String date;
    private String loanId;
    private String loanAmount;
    private String  dateDue;
    private String msisdn;
}