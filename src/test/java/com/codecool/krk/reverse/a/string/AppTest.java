package com.codecool.krk.reverse.a.string;

import com.codecool.krk.BasicAlgorithms;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void reverseStringTest() {

        String result = BasicAlgorithms.reverseString("hello");

        assertTrue(result instanceof String);
    }

    @Test
    void reverseStringTest2() {

        String result = BasicAlgorithms.reverseString("hello");
        String expected = "olleh";

        assertEquals(expected, result);
    }

    @Test
    void reverseStringTest3() {

        String result = BasicAlgorithms.reverseString("Howdy");
        String expected = "ydwoH";

        assertEquals(expected, result);
    }

    @Test
    void reverseStringTest4() {

        String result = BasicAlgorithms.reverseString("Greetings from Earth");
        String expected = "htraE morf sgniteerG";

        assertEquals(expected, result);
    }
}