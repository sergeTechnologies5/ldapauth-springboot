package com.innovativeintelli.ldapauthenticationjwttoken.controller;


import com.innovativeintelli.ldapauthenticationjwttoken.models.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("jiokolee/api")
@Slf4j
public class Apis {

    @RequestMapping("loans/borrowed")
    BorrowedResponse getBorrowedLoansByMSISDN(@RequestParam("msisdn") String msisdn) {
        log.info("-------- {} -----", msisdn);
        BorrowedResponse borrowedResponse = new BorrowedResponse();
        LoanBorrowed loanBorrowed = new LoanBorrowed();
        loanBorrowed.setId("1");
        loanBorrowed.setDate("2018-11-12 09:05:11.002");
        loanBorrowed.setLoanId("222");
        loanBorrowed.setLoanAmount("0");
        loanBorrowed.setDateDue("2018-11-12 09:05:11.002");
        loanBorrowed.setMsisdn("254764555215");
        List<LoanBorrowed> loanBorrowedList = new ArrayList<>();
        loanBorrowedList.add(loanBorrowed);
        loanBorrowedList.add(loanBorrowed);
        loanBorrowedList.add(loanBorrowed);
        borrowedResponse.setLoans(loanBorrowedList);
        borrowedResponse.setResponseCode("00");
        borrowedResponse.setResponseDescription("Request processed successfully");
        return borrowedResponse;
    }

    @PostMapping("loans/borrowed")
    BorrowedResponse getBorrowedLoans(@RequestBody LinkedHashMap<String, String> data) {
        log.info("Borrowed Loans ........ {}", data);
        BorrowedResponse borrowedResponse = new BorrowedResponse();
        LoanBorrowed loanBorrowed = new LoanBorrowed();
        loanBorrowed.setId("1");
        loanBorrowed.setDate("2018-11-12 09:05:11.002");
        loanBorrowed.setLoanId("222");
        loanBorrowed.setLoanAmount("0");
        loanBorrowed.setDateDue("2018-11-12 09:05:11.002");
        loanBorrowed.setMsisdn("254764555215");
        List<LoanBorrowed> loanBorrowedList = new ArrayList<>();
        loanBorrowedList.add(loanBorrowed);
        loanBorrowedList.add(loanBorrowed);
        loanBorrowedList.add(loanBorrowed);
        borrowedResponse.setLoans(loanBorrowedList);
        borrowedResponse.setResponseCode("00");
        borrowedResponse.setResponseDescription("Request processed successfully");
        return borrowedResponse;
    }

    //out standing loans
    @RequestMapping(value = "loans/outstanding", method = {RequestMethod.GET})
    OutStandingResponse getOutSandingByMsisdn(@RequestParam("msisdn") String msisdn) {
        OutStandingResponse outStandingResponse = new OutStandingResponse();
        OutStandingLoan outStandingLoan = new OutStandingLoan();
        outStandingLoan.setDate("2018-02-15T08:58:42.557+00:00");
        outStandingLoan.setLoanId("75830");
        outStandingLoan.setMSISDN("25489047362");
        outStandingLoan.setOutstandingBalance("50");
        outStandingLoan.setPrincipalAmount("60");
        List<OutStandingLoan> outStandingLoans = new ArrayList<>();
        outStandingLoans.add(outStandingLoan);
        outStandingLoans.add(outStandingLoan);
        outStandingLoans.add(outStandingLoan);
        outStandingLoans.add(outStandingLoan);
        outStandingResponse.setLoans(outStandingLoans);
        return outStandingResponse;
    }

    @PostMapping("loans/outstanding")
    OutStandingResponse getOutSanding(@RequestBody LinkedHashMap<String, String> data) {

        log.info("Out standing {}", data);
        OutStandingResponse outStandingResponse = new OutStandingResponse();
        OutStandingLoan outStandingLoan = new OutStandingLoan();
        outStandingLoan.setDate("2018-02-15T08:58:42.557+00:00");
        outStandingLoan.setLoanId("75830");
        outStandingLoan.setMSISDN("25489047362");
        outStandingLoan.setOutstandingBalance("50");
        outStandingLoan.setPrincipalAmount("60");
        List<OutStandingLoan> outStandingLoans = new ArrayList<>();
        outStandingLoans.add(outStandingLoan);
        outStandingLoans.add(outStandingLoan);
        outStandingLoans.add(outStandingLoan);
        outStandingLoans.add(outStandingLoan);
        outStandingResponse.setLoans(outStandingLoans);
        return outStandingResponse;
    }

    //repaid loans
    @RequestMapping(value = "loans/repaid", method = {RequestMethod.GET})
    RepaidResponse getRepaidByMsisdn(@RequestParam("msisdn") String msisdn) {
        RepaidResponse repaidResponse = new RepaidResponse();
        RepaidLoan repaidLoan = new RepaidLoan();
        repaidLoan.setAmountPaid("453");
        repaidLoan.setDate("018-02-15T08:58:42.557+00:00");
        repaidLoan.setLoanId("85372");
        repaidLoan.setMsisdn("254763027342");
        repaidLoan.setRecoveryMode("NULL");
        List<RepaidLoan> repaidLoans = new ArrayList<>();
        repaidLoans.add(repaidLoan);
        repaidLoans.add(repaidLoan);
        repaidLoans.add(repaidLoan);
        repaidLoans.add(repaidLoan);
        repaidResponse.setLoansRepaid(repaidLoans);
        return repaidResponse;
    }

    @PostMapping("loans/repaid")
    RepaidResponse getRepaid(@RequestBody LinkedHashMap<String, String> data) {
        log.info("Loans Repaid{}" ,data);
        RepaidResponse repaidResponse = new RepaidResponse();
        RepaidLoan repaidLoan = new RepaidLoan();
        repaidLoan.setAmountPaid("453");
        repaidLoan.setDate("018-02-15T08:58:42.557+00:00");
        repaidLoan.setLoanId("85372");
        repaidLoan.setMsisdn("254763027342");
        repaidLoan.setRecoveryMode("NULL");
        List<RepaidLoan> repaidLoans = new ArrayList<>();
        repaidLoans.add(repaidLoan);
        repaidLoans.add(repaidLoan);
        repaidLoans.add(repaidLoan);
        repaidLoans.add(repaidLoan);
        repaidResponse.setLoansRepaid(repaidLoans);
        return repaidResponse;
    }

    //customer positions
    @RequestMapping("customer/payment/position")
    CustomerPosition getCustomerPosition(@RequestParam("msisdn") String msisdn){
        CustomerPosition customerPosition = new CustomerPosition();
        customerPosition.setOutstandingLoanAmount("0");
        customerPosition.setResponseCode("00");
        customerPosition.setResponseDescription("Request processed successfully");
        return  customerPosition;
    }

    //customer scores
    @RequestMapping("customer/score")
    CustomerScore getCustomerScore(@RequestParam("msisdn") String msisdn){
        CustomerScore customerScore = new CustomerScore();
        customerScore.setCustomerMSISDN("254764555215");
        customerScore.setCustomerName("1100161134816");
        customerScore.setCustomerScore("10");
        customerScore.setResponseCode("00");
        customerScore.setResponseDescription("Request processed successfully");
        return  customerScore;
    }

    @GetMapping("configs")
    ConfigResponse getConfigs(){
        log.info("Loading configs ......");
        ConfigResponse configResponse = new ConfigResponse();
        configResponse.setResponseCode("Request processed successfully");
        List<Configs> configs = new ArrayList<>();
        configs.add(new Configs(1,"CONFIRMED.Ksh 100 has been deducted to repay your jiokolee credo. Your outstanding balance is ksh%s. Topup your line NOW to clear the owed amount","message.account.repayment.partial"));
        configs.add(new Configs(2,"jiokoleecredit","ag.credit.airtime.txn"));
        configs.add(new Configs(3,"jiokoleedata","tag.credit.data.txn"));
        configs.add(new Configs(4,"jiokoleecredit","ag.debit.principal.txn"));
        configs.add(new Configs(5,"JiokoleeFees","tag.debit.fee.txn"));
        configResponse.setConfigurations(configs);
        return configResponse;
    }

    @PostMapping("addconfig")
    Map<String, String> addConfig(@RequestBody LinkedHashMap<String, String> data){
        log.info("Config Data {}",data);
        Map<String, String> res = new HashMap<>();
        res.put("responseCode","00");
        res.put("responseDescription","Request processed successfully");
        return res;
    }

    @PutMapping("addconfig")
    Map<String, String> updateConfig(@RequestBody LinkedHashMap<String, String> data){
        log.info("Config Data ID {} {}", data.get("name"), data);
        Map<String, String> res = new HashMap<>();
        res.put("responseCode","00");
        res.put("responseDescription","Request processed successfully");
        return res;
    }

    @GetMapping("loans/borrowed/count")
    Map<String, String> getBorrowedCount(){
        Map<String, String> res = new HashMap<>();
        res.put("responseCode","00");
        res.put("responseDescription","Request processed successfully");
        res.put("count","98");
        return  res;
    }

    @GetMapping("loans/repaid/count")
    Map<String, String> getRepaidCount(){
        Map<String, String> res = new HashMap<>();
        res.put("responseCode","00");
        res.put("responseDescription","Request processed successfully");
        res.put("count","58");
        return  res;
    }
    @GetMapping("loans/outstanding/count")
    Map<String, String> getOutStandingCount(){
        Map<String, String> res = new HashMap<>();
        res.put("responseCode","00");
        res.put("responseDescription","Request processed successfully");
        res.put("count","69");
        return  res;
    }

    @GetMapping("score")
    Customer getCustomers(@RequestParam("msisdn") String msisdn){
        log.info("data === {}", msisdn);
        return  new Customer();
    }
}
