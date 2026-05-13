package chapter4.Section1_Class_Definitions.Ex_4_0_4_Billing_system;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Bill {

    public static final double RATE = 150.0;    //  Dollars per quarter-hour

    private int hours;
    private int minutes;
    private double fee;

    public void inputTimeWorked() {
        System.out.println("Enter number of full hours worked");
        System.out.println("followed by number of minutes:");
        Scanner keyboard = new Scanner(System.in);
        hours = keyboard.nextInt();
        minutes = keyboard.nextInt();
    }

    private double computeFee(int hoursWorked, int minutesWorked) {
        minutesWorked = hoursWorked * 60 + minutesWorked;
        int quarterHours = minutesWorked / 15;
        //  Any remaining fraction of a quarter-hour is not charged for
        return quarterHours * RATE;
    }

    public void updateFee() {
        fee = computeFee(hours, minutes);
    }

    public void outputBill() {
        System.out.println("Time worked:");
        System.out.println(hours + " hours and " + minutes + " minutes");

        // produce an object that formats numbers according to the default location
        NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.print("Rate: ");
        System.out.print(moneyFormatter.format(RATE));
        System.out.println(" per quarter hour.");
        System.out.print("Amount due: ");
        System.out.println(moneyFormatter.format(fee));
    }

}
