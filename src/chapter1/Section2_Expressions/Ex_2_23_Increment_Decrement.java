/*
What is the output produced by the following lines of program code?
int n = 3;
n++;
System.out.println("n == " + n);
n−−;
System.out.println("n == " + n);
 */

package chapter1.Section2_Expressions;

public class Ex_2_23_Increment_Decrement {
    public static void main(String[] args) {
        int n = 3;
        n++;
        System.out.println("n == " + n); // n == 4
        n--;
        System.out.println("n == " + n); // n == 3
    }
}
