/*
Write an if-else statement that outputs the word "High" if the value of the
variable score is greater than 100 and outputs "Low" if the value of score is at
most 100. The variable score is of type int.
 */


package chapter3.Section1_Branching;

import java.util.Scanner;

public class Ex_3_1_High_Low_Value {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int score = keyboard.nextInt();
        if (score > 100)
            System.out.println("High");
        else
            System.out.println("Low");
    }
}
