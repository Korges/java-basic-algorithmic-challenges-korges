package com.codecool.krk.seek.and.destroy;

import com.codecool.krk.BasicAlgorithms;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class AppTest {

    @Test
    void destroyerTest() {

        Object[] testArray = {1, 2, 3, 1, 2, 3};

        Object[] result = BasicAlgorithms.destroyer(testArray, 2, 3);
        Object[] expected = {1, 1};

        assertArrayEquals(expected, result);
    }

    @Test
    void destroyerTest2() {

        Object[] testArray = {3, 5, 1, 2, 2};

        Object[] result = BasicAlgorithms.destroyer(testArray, 2, 3, 5);
        Object[] expected = {1};

        assertArrayEquals(expected, result);
    }

    @Test
    void destroyerTest3() {

        Object[] testArray = {2, 3, 2, 3};

        Object[] result = BasicAlgorithms.destroyer(testArray, 2, 3);
        Object[] expected = {};

        assertArrayEquals(expected, result);
    }

    @Test
    void destroyerTest4() {

        Object[] testArray = {"tree", "hamburger", 53};

        Object[] result = BasicAlgorithms.destroyer(testArray, "tree", 53);
        Object[] expected = {"hamburger"};

        assertArrayEquals(expected, result);
    }


}
