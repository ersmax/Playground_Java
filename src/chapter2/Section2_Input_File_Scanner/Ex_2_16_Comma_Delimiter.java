/*
Suppose your code creates an object of the class Scanner named keyboard (as
described in this chapter). Write code to change the delimiter for keyboard to
a comma followed by a blank.
 */

package chapter2.Section2_Input_File_Scanner;

import java.util.Scanner;

public class Ex_2_16_Comma_Delimiter {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        keyboard.useDelimiter(", ");
        String word1, word2;
        System.out.println("Enter a line of text:");

        word1 = keyboard.next();
        word2 = keyboard.next();

        System.out.println("The two words are:");
        System.out.println(word1);
        System.out.println(word2);
    }
}
