/*
Write a method called fractionDone that could be added to the class
DateThirdTry in Display 4.4. The method fractionDone has a parameter
targetDay of type int (for a day of the month) and returns a value of type
double. The value returned is the value of the day instance variable divided by
the int parameter targetDay. (So it returns the fraction of the time passed so
far this month where the goal is reaching the targetDay.) Use floating-point
division, not integer division. To get floating-point division, copy the value of
the day instance variable into a local variable of type double and use this local
variable in place of the day instance variable in the division. (You may assume
the parameter targetDay is a valid day of the month that is greater than the
value of the day instance variable.)
 */

package chapter4.Section2_Information_hiding_Encapsulation.Ex_4_05_Fraction_date;

public class DateThirdTryDemo {

    public static void main(String[] args) {
        DateThirdTry date = new DateThirdTry();
        int year = 1900;
        date.setDate(6, 3, 2026);
        date.writeOutput();
        int targetDay = 30;
        assert (targetDay >= date.getDay());
        System.out.println("Time elapsed to target day (" + targetDay + "):");
        System.out.println(date.fractionDone(targetDay));
    }
}
