package chapter2;

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

    }
}
