package com.codecool.krk.slasher.flick;

import com.codecool.krk.BasicAlgorithms;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void slasherTest() {

        Object[] testArray = {1, 2, 3};
        Object[] result = BasicAlgorithms.slasher(testArray, 2);
        Object[] expected = {3};

        assertArrayEquals(expected, result);
    }

    @Test
    void slasherTest2() {

        Object[] testArray = {1, 2, 3};
        Object[] result = BasicAlgorithms.slasher(testArray, 0);
        Object[] expected = {1, 2, 3};

        assertArrayEquals(expected, result);
    }

    @Test
    void slasherTest3() {

        Object[] testArray = {1, 2, 3};
        Object[] result = BasicAlgorithms.slasher(testArray, 9);
        Object[] expected = {};

        assertArrayEquals(expected, result);
    }

    @Test
    void slasherTest4() {

        Object[] testArray = {1, 2, 3};
        Object[] result = BasicAlgorithms.slasher(testArray, 2);
        Object[] expected = {3};

        assertArrayEquals(expected, result);
    }

    @Test
    void slasherTest5() {

        Object[] testArray = {1, 2, "chicken", 3, "potatoes", "cheese", 4};
        Object[] result = BasicAlgorithms.slasher(testArray, 5);
        Object[] expected = {"cheese", 4};

        assertArrayEquals(expected, result);
    }


}
