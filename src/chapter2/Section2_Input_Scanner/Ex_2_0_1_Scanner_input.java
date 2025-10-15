package chapter2.Section2_Input_Scanner;
/*
Program that demonstrates the use of class Scanner
 */
import java.util.Scanner;

public class Ex_2_0_1_Scanner_input {
    public static void main(String[] args) {
        // Precondition: there are at least two integers
        // in the input stream.
        // Postcondition: the number of pods,
        // the number of peas per pod, and
        // the total number of peas have been written to
        // the screen.
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the number of pods followed by:");
        System.out.println("the number of peas in a pod:");
        int numberOfPods = keyboard.nextInt();
        int peasPerPod = keyboard.nextInt();

        int totalNumberOfPeas = numberOfPods * peasPerPod;

        System.out.print(numberOfPods + " pods and ");
        System.out.println(peasPerPod + " peas per pod.");
        System.out.println("The total number of peas is "
                            + totalNumberOfPeas);
    }
}
