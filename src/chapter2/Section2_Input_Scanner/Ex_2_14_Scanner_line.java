package chapter2.Section2_Input_Scanner;

/*
Write a complete Java program that reads in a line of text containing exactly
three words (separated by any kind or amount of whitespace) and outputs the
line with spacing corrected; that is, the output has no space before the first
word and exactly one space between each pair of adjacent words.
 */

import java.util.Scanner;

public class Ex_2_14_Scanner_line {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String text1, text2, text3, dummy, text;
        System.out.println("Enter the line of text with 3 words:");
        text1 = keyboard.next();
        text2 = keyboard.next();
        text3 = keyboard.next();
        dummy = keyboard.nextLine();
        text = keyboard.nextLine();
        System.out.println(text1 + " " + text2 + " " + text3 + " " + text);
    }
}
