package chapter4.Section2_Information_hiding_Encapsulation.Ex_4_12_This_parameter;

import java.util.Scanner;

public class DateSecondTry {
    private String month;
    private int day;
    private int year;

    public void writeOutput() {
        System.out.println(month + " " + day + " " + year);
    }

    public void readInput() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter month, day and year.");
        System.out.println("Do not use comma.");
        month = keyboard.next();
        day = keyboard.nextInt();
        year = keyboard.nextInt();
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        if (this.month.equalsIgnoreCase("January"))
            return 1;
        else if (this.month.equalsIgnoreCase("February"))
            return 2;
        else if (this.month.equalsIgnoreCase("March"))
            return 3;
        else if (this.month.equalsIgnoreCase("April"))
            return 4;
        else if (this.month.equalsIgnoreCase("May"))
            return 5;
        else if (this.month.equalsIgnoreCase("June"))
            return 6;
        else if (this.month.equalsIgnoreCase("July"))
            return 7;
        else if (this.month.equalsIgnoreCase("August"))
            return 8;
        else if (this.month.equalsIgnoreCase("September"))
            return 9;
        else if (this.month.equalsIgnoreCase("October"))
            return 10;
        else if (this.month.equalsIgnoreCase("November"))
            return 11;
        else if (this.month.equalsIgnoreCase("December"))
            return 12;
        else {
            System.out.println("Fatal Error");
            System.exit(0);
            return 0;   // needed to keep compiler happy
        }
    }
}
