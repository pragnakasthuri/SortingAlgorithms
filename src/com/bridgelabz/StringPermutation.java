package com.bridgelabz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Write static functions to return all permutations of a String using iterative method and
 * Recursion method. Check if the arrays returned by two string functions are equal.
 */

public class StringPermutation {
    /**
     * Creating two arraylists to store recursiveResultList and iterativeResultList
     */

    public static List<String> recursiveResultList = new ArrayList<>();
    public static List<String> iterativeResultList = new ArrayList<>();

    /**
     * Creating permutationUsingRecursion method to get string permutations
     * using recursive function
     * @param givenString - taking the given string as parameter
     * @param permutedString - taking permuted string as parameter in recursive function
     */
    public static void permutationUsingRecursion(String givenString , String permutedString) {
        if (givenString.length() == 0)
        {
            recursiveResultList.add(permutedString);
            return;
        }

        for(int i = 0 ;i < givenString.length(); i++)
        {
            char character = givenString.charAt(i);
            String leftSubString = givenString.substring(0, i);
            String rightSubString = givenString.substring(i + 1);
            String result = leftSubString + rightSubString;
            permutationUsingRecursion(result, permutedString + character);
        }
    }

    /**
     * Creating this method to perform String permutation
     * @param givenString - taking the givenString as parameter
     */
    public static void permutationUsingIteration(String givenString)
    {
        if (givenString == null || givenString.length() == 0) {
            return;
        }

        /**
         * Initialize the list with the first character of the string
         */
        iterativeResultList.add(String.valueOf(givenString.charAt(0)));

        /**
         * Do for every character of the specified string
         */
        for (int i = 1; i < givenString.length(); i++) {
            for (int j = iterativeResultList.size() - 1; j >= 0 ; j--) {
                /**
                 * Remove current partial permutation from the ArrayList
                 */
                String currentPartialPermutation = iterativeResultList.remove(j);

                for (int k = 0; k <= currentPartialPermutation.length(); k++) {
                    iterativeResultList.add(currentPartialPermutation.substring(0, k) + givenString.charAt(i)
                                + currentPartialPermutation.substring(k));
                }
            }
        }
    }

    /**
     * Main method from where the execution starts
     * @param args - default java param
     */
    public static void main(String args[]) {

        /**
         * PROCEDURE:
         * 1.Creating scanner object
         * 2.Printing to take input from user and storing in givenString
         * 3.calling permutationUsingRecursion
         * 4.Calling the permutationUsingIteration
         * 5.Calling the printAndCompareTheResults to check weather the two results are equal
         */

        /**
         * 1.Creating scanner object
         */
        Scanner scanner = new Scanner(System.in);

        String permutedString = "";
        /**
         * 2.Printing to take input from user and storing in givenString
         */
        System.out.println("Enter the string : ");
        String givenString = scanner.next();
        scanner.close();

        /**
         * 3.calling permutationUsingRecursion
         */
        permutationUsingRecursion(givenString, permutedString);

        /**
         * 4.Calling the permutationUsingIteration
         */
        permutationUsingIteration(givenString);

        /**
         * 5.Calling the printAndCompareTheResults to check weather the two results are equal
         */
        printAndCompareTheResults();
    }

    /**
     * This method is used to check weather the two results are equal
     */
    public static void printAndCompareTheResults() {
        /**
         * Printing results for iteration approach and recursive approach
         */
        System.out.println("Iteration approach result: "+ recursiveResultList);
        System.out.println("Recursive approach result: "+ iterativeResultList);

        /**
         * Converting list in to Array using toArray method
         */
        String[] arr1 = recursiveResultList.toArray(new String[0]);
        String[] arr2 = iterativeResultList.toArray(new String[0]);

        /**
         * Sorting both the arrays arr1 and arr2
         */
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        /**
         * Checking for equality
         */
        for(int i=0; i<arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                System.out.println("Two results are not equal");
                return;
            }
        }
        System.out.println("Two results are equal");
    }
}





