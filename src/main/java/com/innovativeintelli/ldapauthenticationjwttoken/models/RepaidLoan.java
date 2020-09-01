package com.innovativeintelli.ldapauthenticationjwttoken.models;

import lombok.Data;

@Data
public class RepaidLoan {
    String date,loanId,amountPaid,recoveryMode,msisdn;
}