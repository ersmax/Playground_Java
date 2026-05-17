/*
Write a method called happyGreeting that could be added to the class
DateSecondTry in Display 4.2. The method happyGreeting writes the string
"Happy Days!" to the screen a number of times equal to the value of the
instance variable day. For example, if the value of day is 3, then it should write
the following to the screen:
Happy Days!
Happy Days!
Happy Days!
Use a local variable.
 */

package chapter4.Section1_Class_Definitions.Ex_4_04_Happy_days;

public class DateFirstTryDemo {

    public static void main(String[] args) {
        DateFirstTry date = new DateFirstTry();
        date.day = 1;
        date.month = "January";
        date.year = 2000;
        date.yellIfNewYear();

        date.day = 3;
        date.month = "January";
        date.year = 2000;
        date.yellIfNewYear();
        date.happyGreeting();
    }
}
