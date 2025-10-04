package chapter2.Section1_Output;

/*
This program demonstrates the use of the NumberFormat class.
 */

import java.text.NumberFormat;
import java.util.Locale;

public class Ex_2_0_2_NumberFormat_class {
    public static void main(String[] args) {

        System.out.println("Without formatting:");
        System.out.println(19.8);
        System.out.println(19.81111);
        System.out.println(19.89999);
        System.out.println(19);

        NumberFormat localCurrencyFormatter = NumberFormat.getCurrencyInstance(); // returns object
        System.out.println("Default location:");
        System.out.println(localCurrencyFormatter.format(19.8));
        System.out.println(localCurrencyFormatter.format(19.81111));
        System.out.println(localCurrencyFormatter.format(19.89999));
        System.out.println(localCurrencyFormatter.format(19));

        NumberFormat chinaCurrencyFormatter = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println("China Foreign currency:");
        System.out.println(chinaCurrencyFormatter.format(19.8));
        System.out.println(chinaCurrencyFormatter.format(19.81111));
        System.out.println(chinaCurrencyFormatter.format(19.89999));
        System.out.println(chinaCurrencyFormatter.format(19));
    }
}
