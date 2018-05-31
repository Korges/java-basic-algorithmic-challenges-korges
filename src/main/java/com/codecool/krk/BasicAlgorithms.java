package com.codecool.krk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Float.NaN;
import static jdk.nashorn.internal.objects.Global.undefined;


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

    public static String truncateString(String givenString, int maxLength) {

        StringBuilder sb = new StringBuilder();
        if (givenString.length() == maxLength) {
            return givenString;
        }
        for (int i = 0; i < maxLength - 3; i++) {
            sb.append(givenString.charAt(i));
        }
        return sb.append("...").toString();
    }

    public static Object[] slasher(Object[] array, int slash) {

        if (slash < 0 || slash > array.length) slash = array.length;
        int position = 0;
        Object[] slashed = new Object[array.length-slash];

        for (int i = slash; i < array.length; i++) {
            slashed[position++] = array[i];
        }

        return slashed;
    }

    public static Object[] bouncer(Object[] givenArray) {

        List<Object> falsyValues = Arrays.asList(false, null, 0, "",undefined , NaN);
        List<Object> temp = new ArrayList<>();
        for (Object obj : givenArray) {
            if (falsyValues.contains(obj)) continue;
            temp.add(obj);
        }

        return temp.toArray();
    }

    public static Object[] destroyer(Object[] givenArray, Object... numbers) {

        List<Object> toRemove = Arrays.asList(numbers);
        List<Object> temp = new ArrayList<>();
        for (Object obj : givenArray) {
            if (toRemove.contains(obj)) continue;
            temp.add(obj);
        }

        return temp.toArray();
    }

    public static int getIndexToIns(Float[] givenArray, float number) {

        float temp;

        for (int i = 0; i < givenArray.length; i++) {
            for (int j = 1; j < givenArray.length - i; j++) {
                if (givenArray[j-1] > givenArray[j]) {
                    temp = givenArray[j-1];
                    givenArray[j-1] = givenArray[j];
                    givenArray[j] = temp;
                }
            }
        }

        int index;
        for (index = 0; index < givenArray.length; index++) {
            if (number <= givenArray[index]) {
                return index;
            }
        }

        return index;
    }

    public static String rot13(String givenString) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < givenString.length(); i++) {
            char c = givenString.charAt(i);
            if       (c >= 'A' && c <= 'M') c += 13;
            else if  (c >= 'N' && c <= 'Z') c -= 13;
            sb.append(c);
        }
        return String.valueOf(sb);
    }

}

