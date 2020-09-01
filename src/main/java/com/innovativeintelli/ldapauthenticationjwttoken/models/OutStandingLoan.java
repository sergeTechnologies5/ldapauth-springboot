package com.innovativeintelli.ldapauthenticationjwttoken.models;

import lombok.Data;

@Data
public class OutStandingLoan {
    private String MSISDN, Date, loanId, principalAmount, outstandingBalance;
}