package chapter3;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Playground {

    public static void main(String[] args) {
        NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance();
        System.out.println(moneyFormatter.format(19.8));

        NumberFormat euroFormatter = NumberFormat.getCurrencyInstance(Locale.ITALY);
        System.out.println(euroFormatter.format(19.8));

        double money = 19.34512321;
        String moneyString = euroFormatter.format(money);
        System.out.println(moneyString);

        DecimalFormat eNotation = new DecimalFormat("#0.##E0");
        System.out.println(eNotation.format(1234));
        System.out.println(eNotation.format(12345));

        DecimalFormat eNotation1 = new DecimalFormat("#0.###E0");
        DecimalFormat eNotation2 = new DecimalFormat("00.###E0");

        System.out.println(eNotation1.format(123.456));
        System.out.println(eNotation2.format(123.456));
        double number = 0.0000123456;
        System.out.println(eNotation.format(number));
        System.out.println(eNotation1.format(number));
        System.out.println(eNotation2.format(number));

        int n = 0;
        if ((n++ > 0) && (n > -1))
            System.out.println("Okay");
        else
            System.out.println("Not okay");
        assert (n == 1);

    }
}
