package com.codecool.krk.factorialize.a.number;

public class App {

    static Integer factorializeNumber(Integer number) {

        if (number == 0) {
            return 1;
        } else {
            return (number * factorializeNumber(number - 1));
        }
    }
}
