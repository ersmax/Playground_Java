package chapter4.Section3_Overloading.Ex_4_0_7_Overloading_set_date;

import java.util.Scanner;

public class DateSixthTryDemo {

    public static void main(String[] args) {
        DateSixthTry date = new DateSixthTry();
        date.readInput();
        System.out.println(date);

        DateSixthTry date2 = new DateSixthTry();
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
