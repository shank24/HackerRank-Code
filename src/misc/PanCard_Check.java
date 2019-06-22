package misc;

import sun.rmi.runtime.Log;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PanCard_Check {
    public static void main(String[] args) {

        String s= "BSTPK9079F";

        Pattern pattern= Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]{1}");

        Matcher matcher = pattern.matcher(s);

        //Check if pattern matches
        if(matcher.matches()){
            System.out.println("Matched");
        }



    }
}
