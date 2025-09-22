/*
What is the output produced by the following lines of program code?
int quotient, remainder;
quotient = 7 / 3;
remainder = 7 % 3;
System.out.println("quotient = " + quotient);
System.out.println("remainder = " + remainder);
 */


package chapter1.Section2_Expressions;

public class Ex_2_19_Ouput_2 {
    public static void main(String[] args) {
        int quotient, remainder;
        quotient = 7 / 3;
        remainder = 7 % 3;
        System.out.println("quotient = " + quotient);   // quotient = 2
        System.out.println("remainder = " + remainder); // remainder = 1
    }
}
