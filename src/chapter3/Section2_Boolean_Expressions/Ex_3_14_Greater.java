/*
Suppose n1 and n2 are two int variables that have been given values. Write an
if-else statement that outputs "n1" if n1 is greater than or equal to n2, and
that outputs "n2" otherwise
 */

package chapter3.Section2_Boolean_Expressions;

import java.util.Scanner;

public class Ex_3_14_Greater {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n1 = keyboard.nextInt();
        int n2 = keyboard.nextInt();

        if (n1 >= n2)
            System.out.println("n1");
        else
            System.out.println("n2");
    }
}
