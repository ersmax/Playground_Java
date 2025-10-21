/*
Continue with the object keyboard from Self-Test Exercise 16. Consider the
following input:
one,two three, four, five
What values will the following code assign to the variables word1 and word2?
String word1 = keyboard.next();
String word2 = keyboard.next();
 */


package chapter2.Section2_Input_File_Scanner;

import java.util.Scanner;

public class Ex_2_17_Comma_delimiter_p2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        keyboard.useDelimiter(", ");
        String word1, word2;
        System.out.println("Enter a line of text:");

        word1 = keyboard.next();
        word2 = keyboard.next();

        System.out.println("The two words are:");
        System.out.println(word1);          // one,two three
        System.out.println(word2);          // four
    }
}
