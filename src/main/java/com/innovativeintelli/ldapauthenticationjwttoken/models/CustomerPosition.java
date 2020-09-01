package com.innovativeintelli.ldapauthenticationjwttoken.models;


public class CustomerPosition {

    public String getOutstandingLoanAmount() {
        return outstandingLoanAmount;
    }

    public void setOutstandingLoanAmount(String outstandingLoanAmount) {
        this.outstandingLoanAmount = outstandingLoanAmount;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseDescription() {
        return responseDescription;
    }

    public void setResponseDescription(String responseDescription) {
        this.responseDescription = responseDescription;
    }

    private String outstandingLoanAmount, responseCode, responseDescription;
}
