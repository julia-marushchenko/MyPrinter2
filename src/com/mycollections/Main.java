/**
 *  Java program to create and print the characters of given string.
 */

package com.mycollections;

import java.util.ArrayList;
import java.util.List;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // String variable.
        String string = "works";

        // Calling method print Characters.
        printCharacters(string);

    }

    // Method to print characters of a string.
    public static void printCharacters(CharSequence charSequence) {
        int index = 0;
        while (index < charSequence.length()) {
            System.out.println(charSequence.charAt(index));
            index = index + 1;
        }
    }

}