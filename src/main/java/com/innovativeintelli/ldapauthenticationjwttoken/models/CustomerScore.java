package com.innovativeintelli.ldapauthenticationjwttoken.models;

import lombok.Data;

@Data
public class CustomerScore {
    private String customerMSISDN, customerName, customerScore, responseCode, responseDescription;
}
