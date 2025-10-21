package chapter2.Section2_Input_Scanner;

/*
Something could go wrong with the following code. Identify and fix the
problem.
Scanner keyboard = new Scanner(System.in);
System.out.println("Enter your age.");
int age = keyboard.nextInt();
System.out.println("Enter your name.");
String name = keyboard.nextLine();
System.out.println(name + ",you are " + age + " years old.");
 */

// The problem is that after calling nextInt(), the newline character
// remains in the input buffer. When nextLine() is called, it reads
// this leftover newline character instead of waiting for user input.
// To fix this, we can add an extra nextLine() call after nextInt()
// to consume the leftover newline character.

import java.util.Scanner;

public class Ex_2_15_Scanne_nextLine {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = keyboard.nextInt();
        String dummy = keyboard.nextLine(); // Consume the leftover newline
        System.out.print("Enter your name: ");
        String name = keyboard.nextLine();
        System.out.println(name + ",you are " + age + " years old.");
        System.out.println(dummy);
    }
}
