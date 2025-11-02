/*
Suppose n1 and n2 are two int variables that have been given values. Write a
Boolean expression that returns true if the value of n1 is greater than or equal
to the value of n2; otherwise, it should return false.
 */

package chapter3.Section2_Boolean_Expressions;

import java.util.Scanner;

public class Ex_3_13_Greater_Equal {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n1, n2;

        n1 = keyboard.nextInt();
        n2 = keyboard.nextInt();

        boolean result = (n1 >= n2);
        System.out.println(result);
    }
}
