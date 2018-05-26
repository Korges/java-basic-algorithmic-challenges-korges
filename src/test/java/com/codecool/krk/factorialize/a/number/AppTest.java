package com.codecool.krk.factorialize.a.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void factorializeNumberTest() {

        Integer result = App.factorializeNumber(5);

        assertTrue(result instanceof Integer);
    }

    @Test
    void factorializeNumberTest2() {

        Integer result = App.factorializeNumber(5);
        Integer expected = 120;

        assertEquals(expected, result);
    }

    @Test
    void factorializeNumberTest3() {

        Integer result = App.factorializeNumber(10);
        Integer expected = 3628800;

        assertEquals(expected, result);
    }

    @Test
    void factorializeNumberTest4() {

        Integer result = App.factorializeNumber(0);
        Integer expected = 1;

        assertEquals(expected, result);
    }



}