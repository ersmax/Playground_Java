package chapter1.Section2_Expressions;
/*
What is the output produced by the following lines of program code?
char a, b;
a = 'b';
System.out.println(a);
b = 'c';
System.out.println(b);
a = b;
System.out.println(a);
 */


public class Ex_2_16_Output {
    public static void main(String[] args) {
        char a, b;
        a = 'b';
        System.out.println(a);  // b
        b = 'c';
        System.out.println(b);  // c
        a = b;
        System.out.println(a);  // c
    }
}
