package com.codecool.krk.falsy.bouncer;

import com.codecool.krk.BasicAlgorithms;
import org.junit.jupiter.api.Test;

import static java.lang.Float.NaN;
import static jdk.nashorn.internal.objects.Global.undefined;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void bouncerTest() {

        Object[] testArray = {7, "ate", "", false, 9};

        Object[] result = BasicAlgorithms.bouncer(testArray);
        Object[] expected = {7, "ate", 9};

        assertArrayEquals(expected, result);
    }

    @Test
    void bouncerTest2() {

        Object[] testArray = {false, null, 0, NaN, undefined, ""};

        Object[] result = BasicAlgorithms.bouncer(testArray);
        Object[] expected = {};

        assertArrayEquals(expected, result);
    }

    @Test
    void bouncerTest3() {

        Object[] testArray = {1, null, NaN, 2, undefined};

        Object[] result = BasicAlgorithms.bouncer(testArray);
        Object[] expected = {1, 2};

        assertArrayEquals(expected, result);
    }


}
