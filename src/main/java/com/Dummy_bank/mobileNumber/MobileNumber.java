package com.Dummy_bank.mobileNumber;

public class MobileNumber{
    private String first;
    private String second;

   public MobileNumber(String first,String second){
        this.first=first;
        this.second=second;
    }
    public MobileNumber(String first){
        this.first=first;
    }
    public String getFirst(){
        return first;
    }
    public String getSecond(){
        return second;
    }

    @Override
    public String toString(){
       return STR."""
               first number: \{first}
               second number: \{second}
               """;
    }
}
