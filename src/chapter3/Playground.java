package chapter3;

import java.text.NumberFormat;
import java.util.Locale;

public class Playground {

    public static void main(String[] args) {
        NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance();
        System.out.println(moneyFormatter.format(19.8));

        NumberFormat euroFormatter = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        System.out.println(euroFormatter.format(19.8));

        double money = 19.34512321;
        String moneyString = euroFormatter.format(money);
        System.out.println(moneyString);
    }
}
