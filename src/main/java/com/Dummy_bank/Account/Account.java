package com.Dummy_bank.Account;


import com.Dummy_bank.mobileNumber.MobileNumber;
import com.Dummy_bank.transactionHistory.TransactionHistory;
import com.Dummy_bank.Main;

import java.time.LocalDate;
import java.util.ArrayList;


public class Account{
    private final String ACCOUNTNUMBER;
    private final String NAME;
    private final String  DOB;
    private Double BALANCE=0.0;
    private final ArrayList<TransactionHistory> HISTORY=new ArrayList<>();
    private final MobileNumber MOBILENUMBER;
    private final String IFSC;
    private final String ADDRESS;


    public Account(String ACCOUNTNUMBER, String NAME, String DOB, MobileNumber mobileNumber, String ifsc, String address){
        this.ACCOUNTNUMBER=ACCOUNTNUMBER;
        this.NAME=NAME;
        this.IFSC=ifsc;
        this.ADDRESS=address;
        this.MOBILENUMBER=mobileNumber;
        this.DOB=DOB;
        HISTORY.add(new TransactionHistory(LocalDate.now(),0.0,0.0,"initial",0));
    }


    void withdraw(double amount){
        if(BALANCE<amount){
            System.out.println("Insufficient balance");

        }else{
            HISTORY.add(new TransactionHistory(LocalDate.now(),amount,BALANCE-amount,"Bank Withdraw",0));
            BALANCE-=amount;
            System.out.println("Transaction Successful ");
        }

    }
    void payTo(long ACCOUNTNUMBER,double amount){
        if(BALANCE<amount){
            System.out.println("Insufficient balance");

        }else{
            HISTORY.add(new TransactionHistory(LocalDate.now(),amount,BALANCE-amount,"Payment",ACCOUNTNUMBER));
            BALANCE-=amount;
            Main.gateWay(amount,ACCOUNTNUMBER);
            System.out.println("Transaction Successful ");
        }
    }

    public void addBalance(double amount){
        BALANCE+=amount;
    }




    @Override
    public String toString(){
        return STR."""
                Account Number= \{ACCOUNTNUMBER}
                Name= \{NAME}
                DOB= \{DOB}
                Balance= \{BALANCE}
                Mobile Number= \{MOBILENUMBER.toString()}
                IFSC= \{IFSC}
                Address= \{ADDRESS}
                Transaction History:-
                | Date | Amount | Balance | Type | Reciever Account Number |
                \{HISTORY.toString()}
                """;
    }

}
