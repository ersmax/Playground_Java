package chapter2.Section2_Input_Scanner;

/*
Write a line of code that uses the object frank from the previous exercise to
read in a word from the keyboard and store the word in the String variable
named w.
 */

import java.util.Scanner;

public class Ex_2_12_Scanner_p3 {
    public static void main(String[] args) {
        Scanner frank = new Scanner(System.in);
        String w;
        w = frank.next();
    }
}
