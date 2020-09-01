package com.innovativeintelli.ldapauthenticationjwttoken.models;

import lombok.Data;

import java.util.List;

@Data
public class BorrowedResponse {

    private String responseCode;
    private String responseDescription;
    private List<LoanBorrowed> loans;

}
