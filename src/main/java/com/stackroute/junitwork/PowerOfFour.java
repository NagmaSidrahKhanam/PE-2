//2.
//Write a Java method to check if a given number is power of 4

package com.stackroute.junitwork;

public class PowerOfFour {

    public  boolean isPower(int num)
    {
        //checking power of 4
        boolean result=true;
        while(num!=1){
            if(num%4 !=0){
                result=false;
                break;
            }
            num/=4;
        }

        return result;
    }
}
