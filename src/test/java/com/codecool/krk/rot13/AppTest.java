package com.codecool.krk.rot13;

import com.codecool.krk.BasicAlgorithms;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void rot13Test() {

        String stringTest = "SERR PBQR PNZC";

        String result = BasicAlgorithms.rot13(stringTest);
        String expectd = "FREE CODE CAMP";

        System.out.println(result);
        assertEquals(expectd, result);
    }

    @Test
    void rot13Test2() {

        String stringTest = "SERR CVMMN!";

        String result = BasicAlgorithms.rot13(stringTest);
        String expectd = "FREE PIZZA!";

        System.out.println(result);
        assertEquals(expectd, result);
    }

    @Test
    void rot13Test3() {

        String stringTest = "GUR DHVPX OEBJA QBT WHZCRQ BIRE GUR YNML SBK.";

        String result = BasicAlgorithms.rot13(stringTest);
        String expectd = "THE QUICK BROWN DOG JUMPED OVER THE LAZY FOX.";

        System.out.println(result);
        assertEquals(expectd, result);
    }


}
