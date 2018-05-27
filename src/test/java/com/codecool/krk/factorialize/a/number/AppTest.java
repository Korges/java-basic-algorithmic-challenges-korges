package com.codecool.krk.factorialize.a.number;

import com.codecool.krk.BasicAlgorithms;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void factorializeNumberTest() {

        Integer result = BasicAlgorithms.factorializeNumber(5);

        assertTrue(result instanceof Integer);
    }

    @Test
    void factorializeNumberTest2() {

        Integer result = BasicAlgorithms.factorializeNumber(5);
        Integer expected = 120;

        assertEquals(expected, result);
    }

    @Test
    void factorializeNumberTest3() {

        Integer result = BasicAlgorithms.factorializeNumber(10);
        Integer expected = 3628800;

        assertEquals(expected, result);
    }

    @Test
    void factorializeNumberTest4() {

        Integer result = BasicAlgorithms.factorializeNumber(0);
        Integer expected = 1;

        assertEquals(expected, result);
    }



}