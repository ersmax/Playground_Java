/*
Write a method called yellIfNewYear that could be added to the class
DateFirstTry in Display 4.1. The method yellIfNewYear has no parameters
and outputs the string "Hurrah!" provided the month instance variable has the
value "January" and the day instance variable has the value 1. Otherwise, it
outputs the string "Not New Year's Day."
 */

package chapter4.Section2_Information_hiding_Encapsulation.Ex_4_02_Yell_new_year;

public class DateFirstTryDemo {

    public static void main(String[] args) {
        DateFirstTry date = new DateFirstTry();
        date.day = 1;
        date.month = "January";
        date.year = 2000;
        date.yellIfNewYear();

        date.day = 2;
        date.month = "January";
        date.year = 2000;
        date.yellIfNewYear();
    }
}
