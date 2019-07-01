package com.stackroute.junitwork;

public class ReverseTheString {
    public boolean checkPalindrome(String s)
    {
        String reverseString="";
        for(char ch: s.toCharArray()){
            reverseString=ch+reverseString;
        }
        return s.equalsIgnoreCase(reverseString);
}
}
