package com.innovativeintelli.ldapauthenticationjwttoken.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Customer {
    private String responseCode;
    private String responseDescription;
    private List<Data> customerScores = new ArrayList<>();

    public Customer(){
        this.responseCode = "00";
        this.responseDescription = "Request processed successfully";
        this.customerScores.add(new Data("254763100016","50","Kiarie, Miss Agnes Wanjiru(Emp No.=5488)"));
        this.customerScores.add(new Data("254763106295","50","Boit, Mr. Evans Kipkoech(Emp No.=19260)"));
    }
    @lombok.Data
    static class Data{
        private String customerMSISDN;
        private String customerName;
        private String customerScore;

        public Data(String customerMSISDN,String customerScore,String customerName){
            this.customerMSISDN = customerMSISDN;
            this.customerScore = customerScore;
            this.customerName = customerName;
        }
    }
}
