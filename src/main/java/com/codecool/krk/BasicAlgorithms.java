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

        StringBuilder reversedString = new StringBuilder();

        for (int i = givenString.length(); i > 0;) {
            reversedString.append(givenString.charAt(--i));
        }
        return reversedString.toString();
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

    public static String titleCaseSentence(String givenString) {

        givenString = givenString.toLowerCase();
        StringBuilder capitalizedString = new StringBuilder(String.valueOf(givenString.charAt(0)).toUpperCase());

        for (int i = 1; i < givenString.length(); i++) {
            if (String.valueOf(givenString.charAt(i-1)).equals(" ")) {
                capitalizedString.append(givenString.toUpperCase().charAt(i));
            } else {
                capitalizedString.append(givenString.charAt(i));
            }
        }
        return capitalizedString.toString();
    }

    public static int[] largestOfFour(int[][] array) {

        int position = 0;
        int[] arrayWithMaxNumber = new int[4];

        for(int[] subArray : array) {

            int maxInArray = 0;

            for (int number : subArray) {
                if (number > maxInArray) {
                    maxInArray = number;
                }
            }
            arrayWithMaxNumber[position++] = maxInArray;
        }

        return arrayWithMaxNumber;
    }

    public static boolean confirmEnding(String givenString, String ending) {

        for (int i = 0; i < ending.length(); i++) {
            if (ending.charAt(ending.length() - i - 1)
                    != givenString.charAt(givenString.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static String repeatStringNumTimes(String givenString, int multiply) {

        StringBuilder sb = new StringBuilder();
        if (multiply > 1) {
            for (int i = 0; i < multiply; i++) {
                sb.append(givenString);
            }
            return String.valueOf(sb);
        } else if (multiply == 1) {
            return givenString;
        }
        return "";
    }
}

