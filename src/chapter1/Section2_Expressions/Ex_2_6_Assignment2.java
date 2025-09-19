package chapter1.Section2_Expressions;

/*
Write a Java assignment statement that will set the value of the variable
interest to the value of the variable balance multiplied by the value of the
variable rate. The variables are of type double.
 */

public class Ex_2_6_Assignment2 {
    public static void main(String[] args) {
        double balance, rate;
        balance = 5;
        rate = 2;
        double interest = balance * rate;
        System.out.println(interest);
    }
}
