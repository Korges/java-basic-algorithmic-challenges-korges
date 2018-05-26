package com.codecool.krk.reverse.a.string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void reverseStringTest() {

        String result = App.reverseString("hello");

        assertTrue(result instanceof String);
    }

    @Test
    void reverseStringTest2() {

        String result = App.reverseString("hello");
        String expected = "olleh";

        assertEquals(expected, result);
    }

    @Test
    void reverseStringTest3() {

        String result = App.reverseString("Howdy");
        String expected = "ydwoH";

        assertEquals(expected, result);
    }

    @Test
    void reverseStringTest4() {

        String result = App.reverseString("Greetings from Earth");
        String expected = "htraE morf sgniteerG";

        assertEquals(expected, result);
    }
}