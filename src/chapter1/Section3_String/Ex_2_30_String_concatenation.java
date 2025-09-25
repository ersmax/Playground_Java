/*
What is the output of the following two lines of Java code?
System.out.println("2 + 2 = " + (2 + 2));
System.out.println("2 + 2 = " + 2 + 2);
 */


package chapter1.Section3_String;

public class Ex_2_30_String_concatenation {
    public static void main(String[] args) {
        System.out.println("2 + 2 = " + (2 + 2)); // 2 + 2 = 4
        System.out.println("2 + 2 = " + 2 + 2);   // 2 + 2 = 22
    }
}
