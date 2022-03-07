package com.bridgelabz;

import java.util.Scanner;

/**
 * Performing Bubble sort on integers
 */

public class BubbleSortProgram {

    /**
     * Creating bubbleSort method to perform bubble sorting for the given array of integers
     *
     * @param arr - taking array of integers as parameter
     */
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Main method from where thw program execution starts
     *
     * @param args - default java param
     */
    public static void main(String[] args) {

        /**
         * PROCEDURE:
         * 1.Taking input from user using scanner class
         * 2.Storing the entered number into numberOfInputs
         * 3.Creating an integer array of size numberOfInputs
         * 4.Iterating numberOfInputs and scanning the string entered by user everytime
         * 5.Calling bubbleSort method
         */

        /**
         * 1.Taking input from user using scanner class
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of integers you want to enter");
        /**
         * 2.Storing the entered number into numberOfInputs
         */
        int numberOfInputs = scanner.nextInt();
        /**
         * 3.Creating an integer array of size numberOfInputs
         */
        int[] numberArray = new int[numberOfInputs];
        /**
         * 4.Iterating numberOfInputs and scanning the number entered by user
         * everytime and storing it in numberArray
         */
        for (int i = 0; i < numberOfInputs; i++) {
            System.out.println("Enter a number");
            numberArray[i] = scanner.nextInt();
        }
        scanner.close();

        /**
         * 5.Calling bubbleSort method
         */
        bubbleSort(numberArray);
        for (int entry : numberArray) {
            System.out.print(entry + "  ");
        }
    }
}
