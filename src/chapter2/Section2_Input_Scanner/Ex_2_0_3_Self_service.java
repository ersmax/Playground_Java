package chapter2.Section2_Input_Scanner;
/*
This program demonstrates the use of Scanner class on
a self-service hardware store.
 */

import java.util.Scanner;

public class Ex_2_0_3_Self_service {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the number of items purchased");
        System.out.println("followed by the cost of one item.");
        System.out.println("Do not use a dollar sign.");

        int count = keyboard.nextInt();
        double price = keyboard.nextDouble();
        double total = count * price;

        System.out.printf("%d items at $%6.2f each.%n", count, price);
        System.out.printf("Total amount due $%.2f.%n", total);

        System.out.println("Please take your shopping,");
        System.out.printf("and give $%6.2f to the cashier.%n", total);
        System.out.println();
        System.out.println("Thank you for using our services.");

    }
}
