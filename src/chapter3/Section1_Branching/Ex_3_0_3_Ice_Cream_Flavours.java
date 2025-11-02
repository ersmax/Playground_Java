package chapter3.Section1_Branching;

import java.util.Scanner;

public class Ex_3_0_3_Ice_Cream_Flavours {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the number of ice cream flavors:");
        int numberOfFlavors = keyboard.nextInt();

        switch (numberOfFlavors) {
            case 32:
                System.out.println("Nice selection");
                break;
            case 1:
                System.out.println("I bet it's a vanilla.");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println(numberOfFlavors + "flavors");
                break;
            default:
                System.out.println("I didn't plan for");
                System.out.println(numberOfFlavors + " flavors.");
                break;
        }
    }
}
