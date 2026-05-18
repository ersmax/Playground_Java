package chapter4.Section4_Constructors.Ex_4_0_8_Date;

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

}
