package com.codecool.krk.largest.of.four;

import com.codecool.krk.BasicAlgorithms;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void largestOfFourTest() {

        int[][] testArray = {{13, 27, 18, 26}, {4, 5, 1, 3}, {32, 35, 37, 39}, {1000, 1001, 857, 1}};

        int[] result = BasicAlgorithms.largestOfFour(testArray);
        int[] expected = {27, 5, 39, 1001};

        assertArrayEquals(expected, result);
    }
}
