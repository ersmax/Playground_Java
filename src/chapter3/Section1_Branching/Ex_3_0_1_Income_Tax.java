package chapter3.Section1_Branching;

import java.util.Scanner;

public class Ex_3_0_1_Income_Tax {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double netIncome, tax, fivePercentTax, tenPercentTax;

        System.out.println("Enter net income.\n" +
                           "Do not include dollar sign.");
        netIncome = keyboard.nextDouble();

        if (netIncome <= 15000)
            tax = 0;
        else if (netIncome <= 30000)
            tax = 0.05 * (netIncome - 15000);
        else {
            fivePercentTax = 0.05 * 15000;
            tenPercentTax = 0.10 * (netIncome - 30000);
            tax = fivePercentTax + tenPercentTax;
        }
        System.out.printf("Tax due = $%.2f%n", tax);
    }
}
