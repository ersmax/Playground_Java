package chapter2.Section2_Input_Scanner;

/*
This program demonstrates the use of the Scanner class
to read different types of input from the user.
 */
import java.util.Scanner;

public class Ex_2_0_2_Scanner_input2 {
    public static void main(String[] args) {
        int n1, n2;
        // Create object of class Scanner and names it scannerObject
        // to use its methods
        Scanner scannerObject  = new Scanner(System.in);

        System.out.println("Enter two whole numbers");
        System.out.println("separated by whitespace:");
        n1 = scannerObject.nextInt();
        n2 = scannerObject.nextInt();
        System.out.println("You entered " + n1 + ", " + n2);

        System.out.println("Next enter two numbers.");
        System.out.println("Decimal points are allowed.");
        double d1, d2;
        d1 = scannerObject.nextDouble();
        d2 = scannerObject.nextDouble();
        System.out.println("You entered " + d1 + ", " + d2);

        System.out.println("Next enter two words:");
        String word1 = scannerObject.next();
        String word2 = scannerObject.next();
        System.out.println("You entered \""
                            + word1 + "\" and \""
                            + word2 + "\"");

        System.out.println("Next enter a line of text:");
        // Get rid of "\n" from the last insertion, then read new line
        scannerObject.nextLine();
        String line = scannerObject.nextLine();
        System.out.println("You entered: \"" + line + "\"");
    }
}
