/*
Write a method called makeItNewYears that could be added to the class
DateFirstTry in Display 4.1. The method makeItNewYears has no parameters
and sets the month instance variable to "January" and the day instance variable
to 1. It does not change the year instance variable.
 */

package chapter4.Section2_Information_hiding_Encapsulation.Ex_4_01_Make_new_years;

public class DateFirstTryDemo {

    public static void main(String[] args) {
        DateFirstTry date1 = new DateFirstTry();
        date1.makeItNewYears();
        date1.year = 2000;
        date1.writeOutput();
    }
}
