package com.codecool.krk.check.is.palindrome;

import com.codecool.krk.BasicAlgorithms;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void checkForPalindromesTest() {

        boolean result = BasicAlgorithms.checkForPalindromes("eye");

        assertTrue(result);
    }

    @Test
    void checkForPalindromesTest2() {

        boolean result = BasicAlgorithms.checkForPalindromes("_eye");

        assertTrue(result);
    }

    @Test
    void checkForPalindromesTest3() {

        boolean result = BasicAlgorithms.checkForPalindromes("race car");

        assertTrue(result);
    }

    @Test
    void checkForPalindromesTest4() {

        boolean result = BasicAlgorithms.checkForPalindromes("My age is 0, 0 si ega ym.");

        assertTrue(result);
    }

    @Test
    void checkForPalindromesTest5() {

        boolean result = BasicAlgorithms.checkForPalindromes("1 eye for of 1 eye.");

        assertFalse(result);
    }

    @Test
    void checkForPalindromesTest6() {

        boolean result = BasicAlgorithms.checkForPalindromes("0_0 (: /-\\ :) 0-0");

        assertTrue(result);
    }

    @Test
    void checkForPalindromesTest7() {

        boolean result = BasicAlgorithms.checkForPalindromes("five|\\_/|four");

        assertFalse(result);
    }
}
