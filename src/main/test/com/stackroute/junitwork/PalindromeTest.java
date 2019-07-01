package com.stackroute.junitwork;

import static org.junit.Assert.*;
import org.junit.*;
public class PalindromeTest {
    private Palindrome palindrome;
    private String s;

    @Before
    public void setUp() throws Exception {


        palindrome = new Palindrome();

    }

    @After
    public void tearDown()  {

    }


    @Test
    public void emptyStringTest() {

        Boolean expectedValue = true;

        Boolean actualValue = palindrome.checkPalindrome("");
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void multipleWhiteSpaceTest() {
        Boolean expectedValue = true;

        Boolean actualValue = palindrome.checkPalindrome("str ess edde sse rts");
        assertEquals(expectedValue, actualValue);


    }

    @Test
    public void singleCharTest() {
        Boolean expectedValue = true;

        Boolean actualValue = palindrome.checkPalindrome("U");
        assertEquals(expectedValue, actualValue);


    }




    @Test
    public void alphaNumericPalindromeTest() throws Exception {
        Boolean expectedValue = true;

        Boolean actualValue = palindrome.checkPalindrome("Ap6 6pA");
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void validPalindromeTest() throws Exception {

        Boolean expectedValue = true;

        Boolean actualValue = palindrome.checkPalindrome("ab cde edc ba");
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void invalidPalindromeTest() throws Exception {
        Boolean expectedValue = false;

        Boolean actualValue = palindrome.checkPalindrome("abc def");
        assertEquals(expectedValue, actualValue);


    }

}