package com.Dummy_bank.Validator;

import com.Dummy_bank.mobileNumber.MobileNumber;

import java.util.regex.Pattern;

public class Validator{
    public static boolean isValid(long ACCOUNTNUMBER) {
        String accountnumber=String.valueOf(ACCOUNTNUMBER);
        if(accountnumber.length()!=12 && accountnumber.matches("\\d*"))
            return true;
        return false;
    }

    public static boolean isValid(String accountname){
        if(accountname.matches("\\w*\\s*"))
            return true;
        return false;
    }
    public static boolean isValidIfsc(String ifsc) {
        if(ifsc.matches("\\w*")){
            return true;
        }
        return false;
    }

    public static boolean isValidMobileNumber(String first) {
        if (first.length()==10 && first.matches("[6-9]\\d*")){
            return true;
        }
        return false;
    }


    public static boolean isValidDob(String dob) {
         Pattern DATE_PATTERN = Pattern.compile(
                "^((2000|2400|2800|(19|2[0-9])(0[48]|[2468][048]|[13579][26]))-02-29)$"
                        + "|^(((19|2[0-9])[0-9]{2})-02-(0[1-9]|1[0-9]|2[0-8]))$"
                        + "|^(((19|2[0-9])[0-9]{2})-(0[13578]|10|12)-(0[1-9]|[12][0-9]|3[01]))$"
                        + "|^(((19|2[0-9])[0-9]{2})-(0[469]|11)-(0[1-9]|[12][0-9]|30))$");
        if(DATE_PATTERN.matcher(dob).matches()){
            return true;
        }
            return false;
    }
}
