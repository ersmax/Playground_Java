/*
Suppose number is a variable of type int. Write an if-else statement that
outputs the word "Positive" if the value of the variable number is greater than
0 and outputs the words "Not positive" if the value of number is less than or
equal to 0.
 */

package chapter3.Section1_Branching;

import java.util.Scanner;

public class Ex_3_3_Positive_Not_positive {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();

        if (number > 0)
            System.out.println("Positive");
        else
            System.out.println("Not positive");
    }
}
