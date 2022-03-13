package com.bridgelabz;
/**
 * Read in a list of words from File. Then prompt the user to enter a word to
 * search the list. The program reports if the search word is found in the list.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BinarySearchWord {
    /**
     * Assigning the file name along with the absolute path to filename
     */
    public static String fileName = "/Users/nareshadla/Desktop/Pragna/Projects/SortingAlgorithms/words";
    /**
     * Creating new ArrayList
     */
    public static List<String> wordsList = new ArrayList<>();

    /**
     * Creating readWordsFromFile to read words from file and split them using regex method
     */
    public static void readWordsFromFile() {
        BufferedReader bufferedReader = null;
        try {
            String line = null;
            bufferedReader = new BufferedReader(new FileReader(fileName));
            while ((line = bufferedReader.readLine()) != null) {
                for(String word : line.toLowerCase().split(",")) {
                    wordsList.add(word);
                }
            }
        }catch (Exception e){
            System.err.println("IO Exception occurred while reading the file"+ e.getMessage());
        }
        finally {
            try {
                bufferedReader.close();
            }catch(Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Creating searchGivenWordUsingBinarySearch method to perform binary search
     * @param wordsList - an array of words
     * @param searchString - the string which you want to search
     * @return the index of the string if found and -1 if not found
     */
    public static int searchGivenWordUsingBinarySearch(String[] wordsList, String searchString) {
        int lowerIndex = 0, higherIndex = wordsList.length - 1;
        while (lowerIndex <= higherIndex) {
            /**
             * Finding the middle index
             */
            int middleIndex = lowerIndex + (higherIndex - lowerIndex) / 2;

            int result = searchString.compareTo(wordsList[middleIndex]);

            /**
             * Checking if searchString is present at middleIndex
             *
             */
            if (result == 0)
                return middleIndex;

            /**
             * If searchString is greater, ignore left half
             */
            if (result > 0)
                lowerIndex = middleIndex + 1;

            /**
             * If searchString is smaller, ignore right half
             */
            else
                higherIndex = middleIndex - 1;
        }
        return -1;
    }


    /**
     * Main method to begin the execution
     * @param args - default java param
     */
    public static void main(String[] args) {
        /**
         * PROCEDURE:
         * 1.Calling the readWordsFromFile method
         * 2.Creating new scanner object to read user input
         * 3.Printing Enter search string and storing it in searchString
         * 4.Converting this wordsList to Array type and storing it in wordsArray
         * 5.Calling sort method of arrays for sorting the words array
         * 6.Calling the searchGivenWordUsingBinarySearch and storing it in result
         * 7.Printing the output message
         */

        /**
         * 1.Calling the readWordsFromFile method
         */
        readWordsFromFile();
        /**
         * 2.Creating new scanner object to read user input
         */
        Scanner scanner = new Scanner(System.in);
        /**
         * 3.Printing Enter search string and storing it in searchString
         */
        System.out.println("Enter search string");
        String searchString = scanner.next();
        /**
         * 4.Converting this wordsList to Array type and storing it in wordsArray
         */
        String[] wordsArray = wordsList.toArray(new String[0]);
        /**
         * 5.Calling sort method of arrays for sorting the words array
         */
        Arrays.sort(wordsArray);
        /**
         * 6.Calling the searchGivenWordUsingBinarySearch and storing it in result
         */
        int result = searchGivenWordUsingBinarySearch(wordsArray, searchString);
        /**
         * 7.Printing the output message
         */
        System.out.println("Word is "+(result == -1 ? "not found" : "found"));
    }
}
