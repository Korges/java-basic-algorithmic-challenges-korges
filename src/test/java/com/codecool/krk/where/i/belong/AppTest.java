package com.codecool.krk.where.i.belong;

import com.codecool.krk.BasicAlgorithms;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void getIndexToInsTest() {

        Float[] testArray = {1f, 2f, 3f, 4f};

        int result = BasicAlgorithms.getIndexToIns(testArray, 1.5f);
        int expected = 1;

        assertEquals(expected, result);
    }

    @Test
    void getIndexToInsTest2() {

        Float[] testArray = {10f, 20f, 30f, 40f, 50f};

        int result = BasicAlgorithms.getIndexToIns(testArray, 30);
        int expected = 2;

        assertEquals(expected, result);
    }

    @Test
    void getIndexToInsTest3() {

        Float[] testArray = {2f, 20f, 10f};

        int result = BasicAlgorithms.getIndexToIns(testArray, 19);
        int expected = 2;

        assertEquals(expected, result);
    }

    @Test
    void getIndexToInsTest4() {

        Float[] testArray = {2f, 5f, 10f};

        int result = BasicAlgorithms.getIndexToIns(testArray, 15);
        int expected = 3;

        assertEquals(expected, result);
    }




}
