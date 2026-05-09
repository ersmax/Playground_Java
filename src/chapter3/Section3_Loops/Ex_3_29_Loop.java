/*
What is the output of the following?
for (int n = 10; n > 0; n = n - 2)
System.out.println("Hello " + n);
 */

/*
Hello 10
Hello 8
Hello 6
Hello 4
Hello 2
 */

package chapter3.Section3_Loops;

public class Ex_3_29_Loop {
    public static void main(String[] args) {
        for (int n = 10; n > 0; n = n - 2)
            System.out.println("Hello " + n);
    }
}
