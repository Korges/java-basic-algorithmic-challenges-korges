package com.codecool.krk.longest.word;

import com.codecool.krk.BasicAlgorithms;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void findLongestWordTest() {

        int result = BasicAlgorithms.findLongestWord("The quick brown fox jumped over the lazy dog");

        assertEquals(6, result);
    }

    @Test
    void findLongestWordTest2() {

        int result = BasicAlgorithms.findLongestWord("Google do a barrel roll");

        assertEquals(6, result);
    }

    @Test
    void findLongestWordTest3() {

        int result = BasicAlgorithms.findLongestWord("What is the average airspeed velocity of an unladen\n" +
                "swallow");

        assertEquals(8, result);
    }

    @Test
    void findLongestWordTest4() {

        int result = BasicAlgorithms.findLongestWord("What if we try a super-long word such as\n" +
                "otorhinolaryngology");

        assertEquals(19, result);
    }


}
