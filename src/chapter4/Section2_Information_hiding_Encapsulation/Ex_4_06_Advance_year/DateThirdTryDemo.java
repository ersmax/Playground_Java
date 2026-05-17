/*
Write a method called advanceYear that could be added to the class
DateThirdTry in Display 4.4. The method advanceYear has one parameter
of type int. The method advanceYear increases the value of the year instance
variable by the amount of this one parameter.
 */

package chapter4.Section2_Information_hiding_Encapsulation.Ex_4_06_Advance_year;

public class DateThirdTryDemo {

    public static void main(String[] args) {
        DateThirdTry date = new DateThirdTry();
        int year = 1900;
        date.setDate(6, 30, 2026);
        date.writeOutput();
        date.advanceYear(2);
        date.writeOutput();
    }
}
