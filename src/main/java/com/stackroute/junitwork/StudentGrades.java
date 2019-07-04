//6. Write a program, which reads number of students and n grades as input (of int
//between 0 and 100, inclusive) and displays the average, minimum and maximum.Your
//program shall check for valid input. You should keep all the grades in an int[] and use a
//method for each of the computations.
//Output:
//Enter the number of students: 4
//Enter the grade for student 1: 86
//Enter the grade for student 2: 65
//Enter the grade for student 3: 98
//Enter the grade for student 4: 77
package com.stackroute.junitwork;

public class StudentGrades {


    public int average(int arr[])
    {
        int sum=0 ;
        for(int element:arr){
            sum+=element;
        }
        return sum/arr.length;

    }
    public int lowest(int arr[])
    {
        int minimum=arr[0] ;
        for(int element:arr){
            if(element<minimum)
                minimum=element;
        }
        return minimum;

    }
    public int highest(int arr[])
    {

        int maximum=arr[0] ;
        for(int element:arr){
            if(element> maximum)
                maximum=element;
        }
        return maximum;
    }
}
