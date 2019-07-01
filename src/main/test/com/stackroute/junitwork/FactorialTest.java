package com.stackroute.junitwork;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FactorialTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestlongFactorial() {
        assertEquals(120,Factorial.longFactorial(5));
        assertEquals(2,Factorial.longFactorial(2));
        assertEquals(1,Factorial.longFactorial(0));

    }
}