package com.codecool.krk.reverse.a.string;

class App {

     static String reverseString(String string) {

        String reversedString = "";

        for (int i = string.length(); i > 0;) {
            reversedString += string.charAt(--i);
        }

        return reversedString;
    }
}
