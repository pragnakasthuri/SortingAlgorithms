package com.bridgelabz;

/**
 * Find the prime numbers that are anagram and palindrome
 */

public class PrimePalindromeAnagram {
    /**
     * @param number - as input to check weather it is prime
     * @return - true if prime and  false if not prime
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
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Creating displayPrimePalindrome to find the prime number which id prime
     */
    public static void displayPrimePalindrome() {
        int count = 0;
        for (int i = 10; i <= 1000; i++) {
            if (isPrime(i)) {
                int number = i, reverseNumber = 0;
                /**
                 * Reverse number logic
                 */
                while (number != 0) {
                    int digit = number % 10;
                    number /= 10;
                    reverseNumber = reverseNumber * 10 + digit;
                }
                if (reverseNumber == i) {
                    /**
                     * Printing the prime palindrome
                     */
                    System.out.println(i);
                }
            }
        }
    }

    /**
     * Main method from where execution begins
     * @param args - default java param
     */
    public static void main(String[] args) {
        /**
         * Calling displayPrimePalindrome method
         */
        displayPrimePalindrome();
    }
}



