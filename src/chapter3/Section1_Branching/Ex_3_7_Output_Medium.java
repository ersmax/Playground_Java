/*
What would be the output in Self-Test Exercise 5 if the assignment were changed
to the following?
int extra = 0;

// medium
 */

package chapter3.Section1_Branching;

public class Ex_3_7_Output_Medium {
    public static void main(String[] args) {

        int extra = 0;
        if (extra < 0)
            System.out.println("small");
        else if (extra == 0)
            System.out.println("medium");
        else
            System.out.println("large");
    }
}
