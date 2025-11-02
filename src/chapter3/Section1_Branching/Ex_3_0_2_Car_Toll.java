package chapter3.Section1_Branching;

import java.util.Scanner;

public class Ex_3_0_2_Car_Toll {
    public static void main(String[] args) {
        int vehicleClass;
        double toll;
        Scanner keyboard = new Scanner(System.in);

        vehicleClass = keyboard.nextInt();
        switch (vehicleClass) {
            case 1:
                int a = 1;
                System.out.println("Passenger car");
                toll = 0.50;
                break;
            case 2:
                System.out.println("Bus");
                toll = 1.50;
                break;
            default:
                System.out.println("Unknown vehicle class");
                break;
            case 3:
                System.out.println("Truck");
                toll = 2.00;
                break;
        }
    }
}
