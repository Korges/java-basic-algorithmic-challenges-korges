package com.codecool.krk.confirm.the.ending;

import com.codecool.krk.BasicAlgorithms;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void confirmEndingTest() {

        boolean expected = BasicAlgorithms.confirmEnding("Bastian", "n");

        assertTrue(expected);
    }

    @Test
    void confirmEndingTest2() {

        boolean expected = BasicAlgorithms.confirmEnding("Connor", "n");

        assertFalse(expected);
    }

    @Test
    void confirmEndingTest3() {

        boolean expected = BasicAlgorithms.confirmEnding("Walking on water and developing software from a" +
                "specification are easy if both are frozen", "specification");

        assertFalse(expected);
    }

    @Test
    void confirmEndingTest4() {

        boolean expected = BasicAlgorithms.confirmEnding("If you want to save our world, you must hurry. We dont know" +
                "how much longer we can withstand the nothing", "mountain");

        assertFalse(expected);
    }

    @Test
    void confirmEndingTest5() {

        boolean expected = BasicAlgorithms.confirmEnding("Open sesame", "same");

        assertTrue(expected);
    }
}
