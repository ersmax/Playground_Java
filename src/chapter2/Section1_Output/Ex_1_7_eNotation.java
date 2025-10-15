package chapter2.Section1_Output;
/*
Write a Java statement to output the value in variable d of type double to the
screen. The output should be in e-notation with three digits after the decimal
point. The output should be in a field of width 15.
 */
public class Ex_1_7_eNotation {
    public static void main(String[] args) {
        double d = 3212.412312213;
        System.out.printf("%15.3e", d);
    }
}
