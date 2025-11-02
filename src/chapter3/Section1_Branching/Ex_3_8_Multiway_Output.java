/*
Write a multiway if-else statement that classifies the value of an int variable n
into one of the following categories and writes out an appropriate message:
n < 0 or 0 ≤ n < 100 or n ≥ 100
Hint: Remember that the Boolean expressions are checked in order.
 */

package chapter3.Section1_Branching;

import java.util.Scanner;

public class Ex_3_8_Multiway_Output {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();

        if (n < 0)
            System.out.printf("%d is less than 0%n", n);
        else if (n < 100)
            System.out.printf("0 <= %d < 100%n", n);
        else
            System.out.printf("%d >= 100%n", n);
    }
}
