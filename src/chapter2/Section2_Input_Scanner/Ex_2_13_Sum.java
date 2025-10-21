package chapter2.Section2_Input_Scanner;

/*
Write a complete Java program that reads in a line of keyboard input
containing two values of type int (separated by one or more spaces) and
outputs the two numbers as well as the sum of the two numbers.
 */

import java.util.Scanner;

public class Ex_2_13_Sum {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n1, n2, sum;

        System.out.print("Enter two numbers: ");
        n1 = keyboard.nextInt();
        n2 = keyboard.nextInt();
        System.out.println("You entered " + n1 + ", " + n2);

        sum = n1+ n2;

        System.out.println("The summation is " + sum);
    }
}
