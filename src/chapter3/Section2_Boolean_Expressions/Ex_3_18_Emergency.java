/*
Write an if-else statement that outputs the word “Emergency” provided the value
of the variable pressure is greater than 100 or the value of the variable temperature
is greater than or equal to 212. Otherwise, the if-else statement should output
the word “OK”. The variables pressure and temperature are both of type int.
 */

package chapter3.Section2_Boolean_Expressions;

import java.util.Scanner;

public class Ex_3_18_Emergency {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int pressure = keyboard.nextInt(),
            temperature = keyboard.nextInt();

        if (pressure > 100 || temperature >= 212)
            System.out.println("Emergency");
        else
            System.out.println("OK");
    }
}
