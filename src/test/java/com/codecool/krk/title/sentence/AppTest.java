package com.codecool.krk.title.sentence;

import com.codecool.krk.BasicAlgorithms;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void titleCaseSentenceTest() {

        String result = BasicAlgorithms.titleCaseSentence("I'm a little tea pot");
        String expected = "I'm A Little Tea Pot";

        assertEquals(expected, result);
    }

    @Test
    void titleCaseSentenceTest2() {

        String result = BasicAlgorithms.titleCaseSentence("sHoRt AnD sToUt");
        String expected = "Short And Stout";

        assertEquals(expected, result);
    }

    @Test
    void titleCaseSentenceTest3() {

        String result = BasicAlgorithms.titleCaseSentence("HERE IS MY HANDLE HERE IS MY SPOUT");
        String expected = "Here Is My Handle Here Is My Spout";

        assertEquals(expected, result);
    }
}
