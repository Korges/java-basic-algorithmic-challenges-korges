package com.codecool.krk.repeat.string.num.times;

import com.codecool.krk.BasicAlgorithms;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void repeatStringNumTimesTest() {

        String result = BasicAlgorithms.repeatStringNumTimes("*", 1);
        String expected = "*";

        assertEquals(expected, result);
    }

    @Test
    void repeatStringNumTimesTest2() {

        String result = BasicAlgorithms.repeatStringNumTimes("abc", 4);
        String expected = "abcabcabcabc";

        assertEquals(expected, result);
    }

    @Test
    void repeatStringNumTimesTest3() {

        String result = BasicAlgorithms.repeatStringNumTimes("*", 8);
        String expected = "********";

        assertEquals(expected, result);
    }

    @Test
    void repeatStringNumTimesTest4() {

        String result = BasicAlgorithms.repeatStringNumTimes("abc", -2);
        String expected = "";

        assertEquals(expected, result);
    }


}
