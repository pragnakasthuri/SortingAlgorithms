package com.bridgelabz;

import java.util.Scanner;

/**
 * Read in strings and prints them in sorted order using insertion sort
 */

public class InsertionSortProgram {

    /**
     * Creating insertion sort method to perform insertion sorting on given strings
     *
     * @param array  - taking array of strings as parameter
     * @param length - length of an array
     */
    static void insertionSort(String[] array, int length) {
        String temp = "";
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i].compareToIgnoreCase(array[j]) > 0) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    /**
     * Main method from where the execution process starts
     *
     * @param args - default java param
     */
    public static void main(String[] args) {
        /**
         * PROCEDURE:
         * 1.Taking input from user using scanner class
         * 2.Storing the entered number into noOfStrings
         * 3.Creating a String array of size noOfStrings
         * 4.Iterating noOfStrings and scanning the number entered by
         *   user everytime and storing it in stringArray
         * 5.Calling insertion sort method
         */

        /**
         * 1.Taking input from user using scanner class
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of strings you want to enter");
        /**
         * 2.Storing the entered number into noOfStrings
         */
        int noOfStrings = scanner.nextInt();
        /**
         * 3.Creating a String array of size noOfStrings
         */
        String[] stringArray = new String[noOfStrings];
        /**
         * 4.Iterating noOfStrings and scanning the number entered by
         * user everytime and storing it in stringArray
         */
        for (int i = 0; i < noOfStrings; i++) {
            System.out.println("Enter a string");
            stringArray[i] = scanner.next();
        }
        scanner.close();

        /**
         * 5.Calling insertion sort method
         */
        insertionSort(stringArray, stringArray.length);
        for (String string : stringArray) {
            System.out.print(string + "  ");
        }
    }
}
