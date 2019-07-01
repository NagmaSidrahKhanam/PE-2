package com.stackroute.junitwork;

import static org.junit.Assert.*;
import org.junit.*;

public class MemberTest {


    Member app;
    Member.MemberVariable app2;

    @BeforeClass
    public static void setUpOnce() {


    }

    @AfterClass
    public static void teardownOnce() {


    }

    @Before
    public void setUp() {

        app = new Member();
        app2 = app.new MemberVariable();
    }

    @After
    public void tearDown() {

        app = null;
    }

    @Test
    public void FirstPalindromeSuccess() {
        //Arrange
        String [] expectedValue = {"henry", "29", "2440.3"};

        //Act
        String [] actualValue = app2.isMember("henry",29,2440);
        //Assert
        assertArrayEquals(expectedValue, actualValue);

        assertNotNull(actualValue);

    }

}