/*
This program demonstrates the use of input and output delimiters.
By changing the delimiters, we can control how input is read
from the keyboard.
 */


package chapter2.Section2_Input_Scanner;

import java.util.Scanner;

public class Ex_2_0_4_Output_Input_Delimiters {
    public static void main(String[] args) {
        Scanner keyboard1 = new Scanner(System.in);
        Scanner keyboard2 = new Scanner(System.in);
        // Delimiter for keyboard1 is whitespace
        // Delimiter for keyboard2 is ##
        keyboard2.useDelimiter("##");

        String word1, word2;
        System.out.println("Enter a line of text:");
        word1 = keyboard1.next();
        word2 = keyboard1.next();
        System.out.println("Normal behavior (whitespace):");
        System.out.println("word1: " + word1);
        System.out.println("word2: " + word2);
        String dummy = keyboard1.nextLine();    // get rid of newline character

        System.out.println("Renter the same line of text:");
        word1 = keyboard2.next();
        word2 = keyboard2.next();
        System.out.println("Changed behavior (## as delimiter):");
        System.out.println("word1: " + word1);
        System.out.println("word2: " + word2);
    }
}
