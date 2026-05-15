package chapter4.Section1_Class_Definitions.Ex_4_0_6_Date_Inside_Outside_views;

import java.util.Scanner;

public class DateFifthTryDemo {

    public static void main(String[] args) {
        DateFifthTry date = new DateFifthTry();
        date.readInput();
        System.out.println(date);

        DateFifthTry date2 = new DateFifthTry();
        int month, day, year;
        do {
            System.out.println("Enter month, day and year as whole numbers");
            Scanner keyboard = new Scanner(System.in);
            month = keyboard.nextInt();
            day = keyboard.nextInt();
            year = keyboard.nextInt();
        } while (!date2.setMonth(month) || !date2.setDay(day) || !date2.setYear(year));

        boolean isEqual = date.equals(date2);
        boolean isLess = date.precedes(date2);
        if (isEqual)
            System.out.println(date + " is equal to " + date2);
        else if (isLess) {
            System.out.println(date + " precedes " + date2);
            String newString = date + " precedes " + date2 + ". Pretty cool";
            // plus operator causes the automatic invocation of toString()
            System.out.println(newString);
        }
        else
            System.out.println(date + " follows " + date2);
    }
}
