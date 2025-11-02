/*
What would be the output in Self-Test Exercise 10 if the first line were changed
to the following?
int key = 5;

// Fruitless
 */

package chapter3.Section1_Branching;

public class Ex_3_12_Switch_Output_4 {
    public static void main(String[] args) {
        int key = 5;
        switch (key + 1)
        {
            case 1:
                System.out.println("Apples");
                break;
            case 2:
                System.out.println("Oranges");
                break;
            case 3:
                System.out.println("Peaches");
            case 4:
                System.out.println("Plums");
                break;
            default:
                System.out.println("Fruitless");
        }
    }
}
