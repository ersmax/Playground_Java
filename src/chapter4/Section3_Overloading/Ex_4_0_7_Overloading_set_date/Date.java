/*
This class differentiates between the inside view (month as String) and
outside view (month as int). In addition, it uses Accessor and Mutator methods.
The mutator methods return a boolean to the caller, so it knows whether the
input succeeds or not.
 */

package chapter4.Section3_Overloading.Ex_4_0_7_Overloading_set_date;

import java.util.Scanner;

public class Date {

    private String month;
    private int day;
    private int year;

    public boolean equals(Date otherDate) {
        return (month.equalsIgnoreCase(otherDate.month) &&
                day == otherDate.day &&
                year == otherDate.year);
    }

    public boolean precedes(Date otherDate) {
        return (year < otherDate.year ||
                year == otherDate.year && getMonth() < otherDate.getMonth() ||
                year == otherDate.year && getMonth() == otherDate.getMonth() && day < otherDate.day);
    }

    public int getYear() {
        return year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        String monthLower = month.toLowerCase();
        switch (monthLower) {
            case "january":
                return 1;
            case "february":
                return 2;
            case "march":
                return 3;
            case "april":
                return 4;
            case "may":
                return 5;
            case "june":
                return 6;
            case "july":
                return 7;
            case "august":
                return 8;
            case "september":
                return 9;
            case "october":
                return 10;
            case "november":
                return 11;
            case "december":
                return 12;
            default:
                System.out.println("Fatal error");
                System.exit(0);
                return 0;  // needed to keep compiler happy
        }
    }

    public String toString() {
        return (month + " " + day + ", " + year);
    }

    public void readInput() {
        boolean tryAgain = true;
        Scanner keyboard = new Scanner(System.in);
        while (tryAgain) {
            System.out.println("Enter month, day and year as whole numbers");
            System.out.println("Do not enter comma in between (e.g. January 12 2026):");
            String monthInput = keyboard.next();
            int dayInput = keyboard.nextInt();
            int yearInput = keyboard.nextInt();
            if (dateOK(monthInput, dayInput, yearInput)) {
                if (setDate(monthInput, dayInput, yearInput))
                    tryAgain = false;
            }
            else
                System.out.println("Illegal date. Reenter input.");
        }
    }

    public boolean setDate(int month, int day, int year) {
        if (dateOK(month, day, year)) {
            this.month = monthString(month);
            this.day = day;
            this.year = year;
            return true;
        }
        else
            return false;
    }

    public boolean setDate(String monthString, int day, int year) {
        if (dateOK(monthString, day, year)) {
            this.month = monthString;
            this.day = day;
            this.year = year;
            return true;
        }
        else
            return false;
    }

    private boolean setDate(int year) {
        return setDate(1, 1, year);
    }

    public boolean setMonth(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12)
            return false;
        else {
            month = monthString(monthNumber);
            return true;
        }
    }

    public boolean setDay(int dayNumber) {
        if (dayNumber < 1 || dayNumber > 31)
            return false;
        else {
            day = dayNumber;
            return true;
        }
    }

    public boolean setYear(int yearNumber) {
        if (yearNumber < 0 || yearNumber > 9999)
            return false;
        else {
            year = yearNumber;
            return true;
        }
    }

    // Private methods
    private boolean dateOK(int monthInt, int dayInt, int yearInt) {
        return (monthInt > 0 && monthInt < 13 &&
                dayInt > 0 && dayInt < 32 &&
                yearInt > 0 && yearInt <= 9999);
    }

    private boolean dateOK(String monthString, int dayInt, int yearInt) {
        return (monthOK(monthString) &&
                dayInt > 0 && dayInt < 32 &&
                yearInt > 0 && yearInt <= 9999);
    }

    private boolean monthOK(String month) {
        return (month.equalsIgnoreCase("january") || month.equalsIgnoreCase("february") ||
                month.equalsIgnoreCase("march") || month.equalsIgnoreCase("april") ||
                month.equalsIgnoreCase("may") || month.equalsIgnoreCase("june") ||
                month.equalsIgnoreCase("july") || month.equalsIgnoreCase("august") ||
                month.equalsIgnoreCase("september") || month.equalsIgnoreCase("october") ||
                month.equalsIgnoreCase("november") || month.equalsIgnoreCase("december"));
    }

    public String monthString(int monthNumber) {
        switch (monthNumber) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                System.out.println("Fatal error");
                System.exit(0);
                return "Error";     // to keep the compiler happy
        }
    }
}
