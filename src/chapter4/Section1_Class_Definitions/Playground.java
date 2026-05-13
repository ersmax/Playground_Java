package chapter4.Section1_Class_Definitions;

import java.util.Scanner;

public class Playground {

    public static int valueOf() {
        int n = 5;
        System.out.println(n);
        return n;
    }

    public static void main(String[] args) {
        System.out.println("Press Enter key to terminate");

        Scanner keyboard = new Scanner(System.in);
        keyboard.nextLine();
        valueOf();
    }
}
