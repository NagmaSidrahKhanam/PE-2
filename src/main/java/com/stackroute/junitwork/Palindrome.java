//1.
//Write a Java method to Reverse the given input & Check if it is a Palindrome.
package com.stackroute.junitwork;

public class Palindrome {
    public boolean checkPalindrome(String s)
    {
        //reverse the string to check palindrome
        String reverseString="";
        for(char ch: s.toCharArray()){
            reverseString=ch+reverseString;
        }
        return s.equalsIgnoreCase(reverseString);
    }
}
