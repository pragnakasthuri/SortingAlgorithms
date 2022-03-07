package com.bridgelabz;

/**
 * This program is to print only prime number in range of 0 - 1000
 * It will iterator through every number in the range and check if prime or not
 */
public class PrimeNumberInRange {

    /**
     * This method is to check the given number is prime or not
     * @param number - number to check
     * @return - true if the given number is prime, otherwise false
     */
    public static boolean isPrime(int number) {
        /**
         * if number is zero or 1 return false
         */
        if (number == 0 || number == 1) {
            return false;
        }
        /**
         * check if given number is 2 then return true
         */
        if (number == 2) {
            return true;
        }
        /**
         * checking if the given number is having any other factor than 1 and itself
         * if it is having another factor then returning false
         */
        for(int i=2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Main method where the program execution starts from here
     * @param args - default java param
     */
    public static void main(String[] args) {
        /**
         * PROCEDURE
         * 1. Iterate through all numbers in given range
         * 2. Check the given number is prime or not by calling the isPrime method
         */

        /**
         * 1. Iterate through all numbers in given range
         */
        for(int i=0; i<1000; i++) {
            /**
             * 2. Check the given number is prime or not by calling the isPrime method
             */
            if (isPrime(i))
                System.out.println(i);
        }
    }
}
