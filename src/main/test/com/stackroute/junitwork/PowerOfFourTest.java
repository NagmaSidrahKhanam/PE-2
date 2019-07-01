package com.stackroute.junitwork;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfFourTest {
    private PowerOfFour power;
    private int num;

    @Before
    public void setUp() {


        power = new PowerOfFour();

    }

    @After
    public void tearDown() {

    }


    @Test
    public void validPower() {

        Boolean expectedValue =true;

        Boolean actualValue = power.isPower(16);
        assertEquals(expectedValue, actualValue);

    }
    @Test
    public void invalidPower() {

        Boolean expectedValue =false;

        Boolean actualValue = power.isPower(32);
        assertEquals(expectedValue, actualValue);

    }
}