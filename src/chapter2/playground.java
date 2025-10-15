package chapter2;

import java.text.DecimalFormat;

public class playground {
    public static void main(String[] args) {
        double price = 19.8;
        char char1 = 'A';
        System.out.print("$");
        System.out.printf("%6.2f", price);
        System.out.println(" each");
        System.out.printf("$%6.2f each.%n", price);
        System.out.printf("$%-6.2f each.%n", price);  // left-justified
        System.out.printf("letter%2c\n", char1);

        double numb = 19.0008;
        DecimalFormat formattingObject = new DecimalFormat("#0.0##");
        String numeral = formattingObject.format(numb);
        System.out.println(numeral);
    }
}
