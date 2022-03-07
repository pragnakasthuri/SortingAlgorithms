package com.bridgelabz;

import java.util.Scanner;

/**
 * Customize Message Demonstration using String Function and RegEx
 */

public class CustomizeMessageUsingRegex {
    /**
     * Taking the given sentence and storing it in MESSAGE
     */
    public static String MESSAGE = "\nHello <<name>>,\nWe have your full" +
            "name as <<full name>> in our system. Your contact number is 91-xxxxxxxxxx.\n" +
            "Please,let us know in case of any clarification.  \nThank you\nBridgeLabz\nxx/xx/xxxx.";

    /**
     * Main method to perform modification
     *
     * @param args - default java param
     */
    public static void main(String[] args) {

        /**
         * PROCEDURE:
         * 1.Creating new scanner object
         * 2.Takes the string as input and stores in name
         * 3.Takes the string as input and stores in full name
         * 4.Takes the string as input and stores in contact number
         *  and closing the scanner class
         * 5.Replacing the message with the strings given by user
         * 6.Printing the modified message
         */

        /**
         * 1.Creating new scanner object
         */
        Scanner scanner = new Scanner(System.in);
        /**
         * 2.Takes the string as input and stores in name
         */
        System.out.println("Enter your name");
        String name = scanner.next();
        /**
         * 3.Takes the string as input and stores in full name
         */
        System.out.println("Enter your full name");
        String fullName = scanner.next();
        /**
         * 4.Takes the string as input and stores in contact number
         * and closing the scanner class
         */
        System.out.println("Enter your contact number");
        String contactNumber = scanner.next();
        scanner.close();

        /**
         * 5.Replacing the message with the strings given by user
         */
        MESSAGE = MESSAGE.replaceAll("<<name>>", name);
        MESSAGE = MESSAGE.replaceAll("<<full name>>", fullName);
        MESSAGE = MESSAGE.replaceAll("xxxxxxxxxx", contactNumber);
        MESSAGE = MESSAGE.replaceAll("xx/xx/xxxx", java.time.LocalDate.now().toString());
        /**
         * 6.Printing the modified message
         */
        System.out.println("Modified message: " + MESSAGE);
    }
}
