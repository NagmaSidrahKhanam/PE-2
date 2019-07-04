//3. Create a class named Member with Name, age, Salary as its variable, write an other
//class named Member Variable that creates an instance of the Member class, initialises its
//member variables, and then displays the value of each member variable.
//Output:
//Members Name: Harry Potter
//Members Age: 30
//Members Salary: 2500.3
package com.stackroute.junitwork;

public class Member {
    class  MemberVariable {
        String name;

        public String[] isMember(String name, int age, double salary) {
            String [] arr={name,String.valueOf(age),String.valueOf(salary)};
            return arr;
        }
    }
}
