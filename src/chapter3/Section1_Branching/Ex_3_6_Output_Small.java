/*
What would be the output in Self-Test Exercise 5 if the assignment were changed
to the following?
int extra = -37;

// small
 */

package chapter3.Section1_Branching;

public class Ex_3_6_Output_Small {
    public static void main(String[] args) {

        int extra = -37;
        if (extra < 0)
            System.out.println("small");
        else if (extra == 0)
            System.out.println("medium");
        else
            System.out.println("large");
    }
}
