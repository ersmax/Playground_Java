/*
Suppose savings and expenses are variables of type double that have been
given values. Write an if-else statement that outputs the word "Solvent",
decreases the value of savings by the value of expenses, and sets the value of
expenses to zero, provided that savings is larger than expenses. If, however,
savings is less than or equal to expenses, the if-else statement should simply
output the word "Bankrupt" without changing the value of any variables.
 */


package chapter3.Section1_Branching;

import java.util.Scanner;

public class Ex_3_2_Solvent_Bankrupt {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double savings, expenses;

        savings = keyboard.nextDouble();
        expenses = keyboard.nextDouble();

        if (savings > expenses) {
            System.out.println("Solvent");
            savings -= expenses;
            expenses = 0;
        } else
            System.out.println("Bankrupt");
    }
}
