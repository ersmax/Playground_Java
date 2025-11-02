/*
What output will be produced by the following code?
int extra = 2;
if (extra < 0)
System.out.println("small");
else if (extra == 0)
System.out.println("medium");
else
System.out.println("large");

Solution: large
 */

package chapter3.Section1_Branching;

public class Ex_3_5_Output {
    public static void main(String[] args) {

        int extra = 2;
        if (extra < 0)
            System.out.println("small");
        else if (extra == 0)
                System.out.println("medium");
        else
            System.out.println("large");
    }
}
