package com.codecool.krk.truncate.a.string;

import com.codecool.krk.BasicAlgorithms;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void truncateStringTest() {

        String result = BasicAlgorithms.truncateString(
                "A-tisket a-tasket A green and yellow basket", 11);
        String expected = "A-tisket...";

        assertEquals(expected, result);
    }

    @Test
    void truncateStringTest2() {

        String result = BasicAlgorithms.truncateString("Peter Piper picked a peck of pickled peppers", 14);
        String expected = "Peter Piper...";

        assertEquals(expected, result);
    }

    @Test
    void truncateStringTest3() {

        String result = BasicAlgorithms.truncateString(
                "A-tisket a-tasket A green and yellow basket", "A-tisket a-tasket A green and yellow basket".length());
        String expected = "A-tisket a-tasket A green and yellow basket";

        assertEquals(expected, result);
    }


}
