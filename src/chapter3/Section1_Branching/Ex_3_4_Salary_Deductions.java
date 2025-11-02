/*
Suppose salary and deductions are variables of type double that have been
given values. Write an if-else statement that outputs the word "Crazy" if
salary is less than deductions; otherwise, it should output "OK" and set the
variable net equal to salary minus deductions.
 */

package chapter3.Section1_Branching;

import java.util.Scanner;

public class Ex_3_4_Salary_Deductions {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double salary, deductions, net;

        salary = keyboard.nextDouble();
        deductions = keyboard.nextDouble();

        if (salary < deductions)
            System.out.println("Crazy");
        else {
            System.out.println("OK");
            net  = salary - deductions;
        }
    }
}
