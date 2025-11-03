/*
Write an if-else statement that outputs the word “Passed” provided the
value of the variable exam is greater than or equal to 60 and also the value
of the variable programsDone is greater than or equal to 10. Otherwise, the
if-else statement should output the word “Failed”. The variables exam and
programsDone are both of type int.
 */

package chapter3.Section2_Boolean_Expressions;

import java.util.Scanner;

public class Ex_3_17_Passed_Failed {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int exam = keyboard.nextInt(),
            programsDone = keyboard.nextInt();

        if ((exam >= 60) && (programsDone >= 10))
            System.out.println("Passed");
        else
            System.out.println("Failed");
    }
}
