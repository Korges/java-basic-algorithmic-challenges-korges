package com.codecool.krk;

public class BasicAlgorithms {


     public static Integer factorializeNumber(Integer number) {

        if (number == 0) {
            return 1;
        } else {
            return (number * factorializeNumber(number - 1));
        }
    }

     public static String reverseString(String givenString) {

        String reversedString = "";

        for (int i = givenString.length(); i > 0;) {
            reversedString += givenString.charAt(--i);
        }
        return reversedString;
    }

     public static boolean checkForPalindromes(String givenString) {

        String onlyLetters = givenString.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        for (int i = 0; i < onlyLetters.length()/2; i++) {
            if (onlyLetters.charAt(i) != onlyLetters.charAt(onlyLetters.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static Integer findLongestWord(String givenString) {

         int maxLength = 0;
         String[] splitArray = givenString.split("\\s+");

         for (String s : splitArray) {
             if (s.length() > maxLength) {
                 maxLength = s.length();
             }
         }
         return maxLength;
    }


}

