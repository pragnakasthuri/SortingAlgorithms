package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This program is to find two given strings are anagrams or not
 * it prints respective result based on the result
 */
public class AnagramProgram {

    /**
     * Main method where the program execution starts
     * @param args - default java param
     */
    public static void main(String[] args) {
        /**
         * PROCEDURE:
         * 1. Taking two string inputs from user and storing them
         * in input1 and input2 and closing the scanner object
         * 2. calling checkAnagrams method to check the logic
         */

        /**
         * 1. Taking two string inputs from user and storing them
         * in input1 and input2 and closing the scanner object
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string ");
        String input1 = scanner.next();
        System.out.println("Enter another string ");
        String input2 = scanner.next();
        scanner.close();

        /**
         * 2.Calling checkAnagrams method to check the logic
         */
        System.out.println("The given strings are "+checkAnagrams(input1, input2));
    }

    /**
     * This method is to compare two given strings are anagrams or not
     * @param input1 - string input1
     * @param input2 - string input2
     * @return - "anagrams" if both are anagrams, otherwise "not anagrams"
     */
    private static String checkAnagrams(String input1, String input2) {
        /**
         * checking the lengths of given two strings
         * if both are not equal returns "not anagrams"
         */
        if (input1.length() != input2.length()) {
            return "not anagrams";
        }
        /**
         * converting given two strings into char arrays
         */
        char[] firstStringCharArray = input1.toCharArray();
        char[] secondStringCharArray = input2.toCharArray();

        /**
         * Sorting two char arrays
         */
        Arrays.sort(firstStringCharArray);
        Arrays.sort(secondStringCharArray);

        /**
         * checking each char in both arrays is same or not
         */
        for(int i=0; i<firstStringCharArray.length; i++) {
            if (firstStringCharArray[i] != secondStringCharArray[i]) {
                return "not anagrams";
            }
        }
        return "anagrams";
    }
}
