package chapter2.Section1_Output;
/*
This program demonstrates the use of the DecimalFormat class.
 */
import java.text.DecimalFormat;

public class Ex_2_0_3_DecimalFormat_class {
    public static void main(String[] args) {
        DecimalFormat pattern00dot000 = new DecimalFormat("00.000");
        DecimalFormat pattern0dot00 = new DecimalFormat("0.00");

        double d = 12.3456789;
        System.out.println("Pattern00.000");
        System.out.println(pattern00dot000.format(d));  // 12.346
        System.out.println("Pattern0dot00");
        System.out.println(pattern0dot00.format(d));    // 12.35

        double money = 19.8;
        System.out.println("Pattern 0.00");
        System.out.println("$" + pattern0dot00.format(money));  // $19.80

        DecimalFormat percent = new DecimalFormat("0.00%");
        System.out.println("Pattern 0.00%");
        System.out.println(percent.format(0.308));  // 30.80%

        DecimalFormat eNotation1 =
                new DecimalFormat("#0.###E0");
        DecimalFormat eNotation2 =
                new DecimalFormat("00.###E0");

        System.out.println("Pattern #0.###E0");
        System.out.println(eNotation1.format(123.456)); // 1.2346E2
        System.out.println("Pattern 00.###E0");
        System.out.println(eNotation2.format(123.456)); // 12.346E1

        double smallNumber = 0.0000123456;
        System.out.println("Pattern #0.###E0");
        System.out.println(eNotation1.format(smallNumber)); // 12.346E-6
        System.out.println("Pattern 00.###E0");
        System.out.println(eNotation2.format(smallNumber)); // 12.345E-6


        DecimalFormat eNotation3 =
                new DecimalFormat("#0.##E0");
        double number = 0.0000123456;
        System.out.println("Pattern");
        System.out.println(eNotation3.format(number));


    }
}
