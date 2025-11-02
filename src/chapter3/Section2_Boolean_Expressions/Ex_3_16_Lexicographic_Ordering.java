/*
Assume that nextWord is a String variable that has been given a String value
consisting entirely of letters. Write some Java code that outputs the message
"First half of the alphabet", provided nextWord precedes "N" in
alphabetic ordering. If nextWord does not precede "N" in alphabetic ordering,
the code should output "Second half of the alphabet". (Note that "N"
uses double quotes to produce a String value, as opposed to using single
quotes to produce a char value.)
 */

package chapter3.Section2_Boolean_Expressions;

import java.util.Scanner;

public class Ex_3_16_Lexicographic_Ordering {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String nextWord = keyboard.nextLine();

        if (nextWord.compareToIgnoreCase("N") < 0)
            System.out.println("First half of the alphabet");
        else
            System.out.println("Second half of the alphabet");

    }
}
