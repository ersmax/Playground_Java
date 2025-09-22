package chapter1.Section2_Expressions;
/*
Convert each of the following mathematical formulas to a Java expression:
3x
3x + y
(x + y)/7
(3x + y) / (z + 2)
 */

public class Ex_2_17_Formulas {
    public static void main(String[] args) {
        int x = 2, y = 3, z = 4;
        int a = 3*x;
        int b = 3*x + y;
        double c = (x + y) / 7.0;
        double d = (3*x + y) / (z + 2.0);
    }
}
