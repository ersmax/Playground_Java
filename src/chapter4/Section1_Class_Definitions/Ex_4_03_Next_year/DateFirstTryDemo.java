/*
Write a method called getNextYear that could be added to the class
DateSecondTry in Display 4.2. The method getNextYear returns an int value
equal to the value of the year instance variable plus one.
 */

package chapter4.Section1_Class_Definitions.Ex_4_03_Next_year;

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
        System.out.println(date.getNextYear());
    }
}
