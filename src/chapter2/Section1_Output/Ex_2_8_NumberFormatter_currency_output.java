package chapter2.Section1_Output;

/*
What output is produced by the following code? (Assume a proper import
statement has been given.)
NumberFormat exerciseFormatter =
NumberFormat.getCurrencyInstance(Locale.US);
double d1 = 1.2345, d2 = 15.67890;
System.out.println(exerciseFormatter.format(d1));
System.out.println(exerciseFormatter.format(d2));
 */

import java.text.NumberFormat;
import java.util.Locale;

public class Ex_2_8_NumberFormatter_currency_output {
    public static void main(String[] args) {
        NumberFormat exerciseFormatter = NumberFormat.getCurrencyInstance(Locale.US);

        double d1 = 1.2345, d2 = 15.67890;
        System.out.println(exerciseFormatter.format(d1)); // $1.23
        System.out.println(exerciseFormatter.format(d2)); // $15.68
    }
}
