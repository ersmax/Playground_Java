package chapter3;

import java.util.Scanner;

public class Playground {
    public static void main(String[] args) {
        String s = "";
        char c = ' ';
        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.println("Enter 'A' for option A " +
                    "or 'B' for option B.");
            s = keyboard.nextLine();
            s = s.toLowerCase();
            // trace
            System.out.println(s);
            c = s.charAt(0);
        } while ((c != 'a') && (c != 'b'));

        System.out.println("You chose option " + c);
        keyboard.close();
    }
}
