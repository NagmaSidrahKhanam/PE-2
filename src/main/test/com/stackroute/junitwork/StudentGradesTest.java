package com.stackroute.junitwork;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class StudentGradesTest {

    StudentGrades obj;

    @Before
    public void setUp() throws Exception {
        obj=new StudentGrades();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    @Test
    public void average() {
        int inputArray[]={25,25,25,25};
        assertEquals(25,obj.average(inputArray));
        assertNotEquals(100,obj.average(inputArray));
    }
    @Test
    public void averageExceeded() {
        int inputArray[]={25,25,101,25};
        assertNotNull("Null is not Expected!",obj.average(inputArray));
    }

    @Test
    public void lowest() {
        int inputArray[]={49,33,34,57};
        assertEquals(33,obj.lowest(inputArray));
        assertNotEquals(49,obj.lowest(inputArray));
    }

    @Test
    public void highest() {
        int inputArray[]={241,243,2504,294};
        assertEquals(2504,obj.highest(inputArray));
        assertNotEquals(294,obj.highest(inputArray));
    }
}