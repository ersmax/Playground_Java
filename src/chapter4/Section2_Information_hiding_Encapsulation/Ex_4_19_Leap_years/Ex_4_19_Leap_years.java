/*
Write a better version of the method dateOK with three int parameters
(Display 4.9). This version should check for the correct number of days in each
month and should not just allow 31 days in any month. It will help to define
another helping method named leapYear, which takes an int argument for
a year and returns true if the year is a leap year. February has 29 days in leap
years and only 28 days in other years. Use the following rule for determining
if the year is a leap year: A year is a leap year if it is divisible by 4 but is not
divisible by 100, or if it is divisible by 400.
 */

/*
public boolean isLeapYear(int year) {
    return (year % 4 == 0 && year % 100 != 0 ||
            year % 400 == 0);
}

private boolean dateOK(int monthInt, int dayInt, int yearInt) {
    int maxDays = 31;
    if (monthInt == 4 || monthInt == 6 || monthInt == 9 || monthInt == 11)
        maxDays = 30;
    else if (monthInt == 2)
        if (isLeapYear(yearInt))
            maxDays = 29;
        else
            maxDays = 28;

    return (monthInt > 0 && monthInt < 13 &&
            dayInt > 0 && dayInt <= maxDays &&
            yearInt > 0 && yearInt <= 9999);
}

 */

package chapter4.Section2_Information_hiding_Encapsulation.Ex_4_19_Leap_years;

public class Ex_4_19_Leap_years {
}
