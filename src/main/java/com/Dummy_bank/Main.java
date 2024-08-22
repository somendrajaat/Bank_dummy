package com.Dummy_bank;

import com.Dummy_bank.Account.Account;
import com.Dummy_bank.mobileNumber.MobileNumber;
import java.util.HashMap;
import java.util.Scanner;



public class Main{

    public static  HashMap<Long, Account> operator=new HashMap<>();
    public static void main() {
        Scanner scanner=new Scanner(System.in);
        operations operations=new operations();
        System.out.println("Operations you can perform:-\n1.showAll\n2.addAccount\n3.getAccount\n4.deleteAccount\n");

        String input=scanner.next();


        while (!input.equalsIgnoreCase("quit")){
            switch (input){
                case "addAccount":
                    long accountnumber=operations.addAccountNumber();
                    String accountname=operations.addUserName();
                    String DOB=operations.addDob();
                    MobileNumber mobileNumber=operations.addMobileNumber();
                    String ifsc=operations.addIfsc();
                    String address=operations.addAddress();
                    operator.put(accountnumber,new Account(Long.toString(accountnumber),accountname,DOB,mobileNumber,ifsc,address));
                    break;
                case "showAll":
                    operator.forEach((k,v)-> System.out.println(v.toString()));
                    break;
                case "getAccount":
                    long accountNumber=operations.addAccountNumber();
                    System.out.println(operator.get(accountNumber).toString());
                    break;
                case "deleteAccount":
                    operator.remove(operations.addAccountNumber());
                    System.out.println("Deleted successfully");
                    break;
            }
            System.out.println("---------------------------\n----------------------------" +
                    "\nOperations you can perform:-\n1.showAll\n2.addAccount\n3.getAccount\n4.deleteAccount");
            input=scanner.next();
        }

    }
    public static void gateWay(double amount, long ACCOUNTNUMBER){
        Account user=operator.get(ACCOUNTNUMBER);
        user.addBalance(amount);
    }



}






