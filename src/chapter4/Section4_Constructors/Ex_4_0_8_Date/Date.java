package chapter4.Section4_Constructors.Ex_4_0_8_Date;

import java.util.Scanner;

public class Date {
    private String month;
    private int day;
    private int year;

    public Date() {
        month = "January";
        day = 1;
        year = 2000;
    }

    public Date(int monthInt, int day, int year) {
        if (!setDate(monthInt, day, year))
            throw new IllegalArgumentException("Invalid date: " + monthInt + "/" + day + "/" + year);
    }

    public Date(String monthString, int day, int year) {
        if (!setDate(monthString, day, year))
            throw new IllegalArgumentException("Invalid date: " + monthString + "/" + day + "/" + year);
    }

    public Date(int year) {
        setDate(1,1, year);
    }

    public Date(Date anotherDate) {
        if (anotherDate == null) {  // not an object
            System.out.println("Fatal error");
            System.exit(0);
        }
        month = anotherDate.month;
        day = anotherDate.day;
        year = anotherDate.year;
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

    public boolean setDate(String month, int day, int year) {
        if (dateOK(month, day, year)) {
            this.month = month;
            this.day = day;
            this.year = year;
            return true;
        }
        else
            return false;
    }

    public boolean setDate(int year) {
        return setDate(1,1, year);
    }

    public boolean setYear(int year) {
        if (year < 0 || year > 9999)
            return false;
        this.year = year;
        return true;
    }

    public boolean setMonth(int monthNumber) {
        if (monthNumber <= 0 || monthNumber > 12)
            return false;
        month = monthString(monthNumber);
        return true;
    }

    public boolean setDay(int day) {
        int maxDays = 31;
        int theMonth = monthInt(this.month);
        if (theMonth == 4 || theMonth == 6 || theMonth == 9 || theMonth== 11)
            maxDays = 30;
        else if (theMonth == 2)
            if (isLeapYear(this.year))
                maxDays = 29;
            else
                maxDays = 28;
        return (day > 0 && day <= maxDays);
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

    public boolean equals(Date anotherDate) {
        return (month.equalsIgnoreCase(anotherDate.month) &&
                day == anotherDate.day &&
                year == anotherDate.year);
    }

    public boolean precedes(Date anotherDate) {
        return (year < anotherDate.year ||
                year == anotherDate.year && getMonth() < anotherDate.getMonth() ||
                year == anotherDate.year && month.equalsIgnoreCase(anotherDate.month) && day < anotherDate.day);
    }

    public String toString() {
        return (month + '/' + day + '/' + year);
    }

    public void readInput() {
        boolean tryAgain = true;
        Scanner keyboard = new Scanner(System.in);
        while (tryAgain) {
            System.out.println("Enter month, day and year (e.g. 1 January 2026 or 01 01 2026");
            String monthInput = keyboard.next();
            int dayInput = keyboard.nextInt();
            int yearInput = keyboard.nextInt();
            if (dateOK(monthInput, dayInput, yearInput))
                if (setDate(monthInput, dayInput, yearInput))
                    tryAgain = false;
            else
                System.out.println("Illegal date. Re-enter input");
        }
    }

    // private methods
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0 ||
                year % 400 == 0);
    }

    private boolean dateOK(int monthInt, int day, int year) {
        int maxDays = 31;
        if (monthInt == 4 || monthInt == 6 || monthInt == 9 || monthInt == 11)
            maxDays = 30;
        else if (monthInt == 2)
            if (isLeapYear(year))
                maxDays = 29;
            else
                maxDays = 28;
        return (monthInt > 0 && monthInt <= 12 &&
                day > 0 && day <= maxDays &&
                year > 0 && year <= 9999);
    }

    private boolean dateOK(String monthString, int day, int year) {
        if (!monthOK(monthString))
            return false;
        int monthInt = monthInt(monthString);
        return dateOK(monthInt, day, year);
    }

    private String monthString(int monthInt) {
        switch (monthInt) {
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
            default: {
                System.out.println("Fatal error");
                System.exit(0);
                return "Error";     // to keep compiler happy
            }
        }
    }

    private int monthInt(String monthString) {
        monthString = monthString.toLowerCase();
        switch (monthString) {
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
            default: {
                System.out.println("Fatal error");
                System.exit(0);
                return 0;   //  to keep compiler happy
            }
        }
    }

    private boolean monthOK(String month) {
        return (month.equalsIgnoreCase("january") || month.equalsIgnoreCase("february") ||
                month.equalsIgnoreCase("march") || month.equalsIgnoreCase("april") ||
                month.equalsIgnoreCase("may") || month.equalsIgnoreCase("june") ||
                month.equalsIgnoreCase("july") || month.equalsIgnoreCase("august") ||
                month.equalsIgnoreCase("september") || month.equalsIgnoreCase("october") ||
                month.equalsIgnoreCase("november") || month.equalsIgnoreCase("december"));
        }

}
