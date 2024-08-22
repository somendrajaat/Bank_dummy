package com.Dummy_bank.transactionHistory;

import java.time.LocalDate;

public class TransactionHistory{
    private final LocalDate DATE;
    private final double AMOUNT;
    private final double BALANCE;
    private final String TYPE;
    private final double RECIEVERACCOUNTNUMBER;

    public TransactionHistory(LocalDate DATE,double AMOUNT,double BALANCE,String TYPE,double RECIEVERACCOUNTNUMBER){
        this.AMOUNT=AMOUNT;
        this.BALANCE=BALANCE;
        this.DATE=DATE;
        this.TYPE=TYPE;
        this.RECIEVERACCOUNTNUMBER=RECIEVERACCOUNTNUMBER;
    }


    public String toString(){
        return STR."""
                | \{DATE} | \{AMOUNT} | \{BALANCE} | \{TYPE} | \{RECIEVERACCOUNTNUMBER} |
                -------------------------------------------------------------------------
                """;
    }
}
