package com.Dummy_bank;

import com.Dummy_bank.Validator.Validator;
import com.Dummy_bank.mobileNumber.MobileNumber;

import java.util.InputMismatchException;
import java.util.Scanner;

public class operations {
    Scanner scanner=new Scanner(System.in);
    public String addUserName(){
        byte corrections=10;
        String AccountName;
        System.out.print("Enter Account Name: ");
        while(corrections!=0){
            AccountName= STR."\{scanner.next()}";


            if(Validator.isValid(AccountName)){
               return AccountName;
            }
            System.out.println("Enter valid account name ");
            corrections--;
        }
        return "";
    }

    public long addAccountNumber(){
        byte corretions=10;
        long accountnumber;
        System.out.println("Enter AccountNumber");
        while(corretions!=0){
            try{
                accountnumber=scanner.nextLong();
                if (Validator.isValid(accountnumber)){
                    return accountnumber;
                }
            }catch (InputMismatchException _){

            }
            System.out.println("Enter Valid account number ");
            corretions--;
        }
        return -1;
    }


    public String addDob(){
       byte correction=10;
       String dob;
        System.out.println("Enter DOB: ");
        while(correction!=0){
            dob=scanner.next();
            if(Validator.isValidDob(dob)){
                return dob;
            }
            System.out.println("Enter valid dob ");
            correction--;
        }
        return "";
    }
    public MobileNumber addMobileNumber(){
        String first,second;
        byte corrections=10;
        while(corrections!=0){
            System.out.println("Enter mobile number:");

            first=STR."\{scanner.next()}";
            second=STR."\{scanner.next()}";

            if(Validator.isValidMobileNumber(first) && Validator.isValidMobileNumber(second)){
                if(second.matches("NA")){
                    return new MobileNumber(first);
                }else return new MobileNumber(first,second);

            }
            corrections--;
        }
        return null;
    }

    public String addIfsc(){
        String ifsc;
        byte correction=10;
        System.out.println("Enter ifsc:");
        while (correction!=0){

            ifsc=scanner.next();
            if(Validator.isValidIfsc(ifsc))
                return ifsc;
            correction--;
        }
        return "";
    }

    public String addAddress() {
        String address;
        System.out.println("Enter address: ");
        System.out.print("building name: ");
        address= STR."\{scanner.next()} ";
        System.out.print("City: ");
        address+= STR."\{scanner.next()} ";
        System.out.print("State: ");
        address+= STR."\{scanner.next()} ";
        System.out.print("Country: ");
        address+=scanner.next();
        return address;
    }

}
