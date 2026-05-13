/*
What is the bug in the following code? What do you call this kind of loop bug?
int n, sum = 0;
for (n = 1; n < 10; n++)
sum = sum + n;
System.out.println("1 + 2 + ...+ 9 + 10 == " + sum);
 */

/*
10 is never added. This is an off-by-one error.
 */

package chapter3.Section4_Debugging;

public class Ex_3_42_Off_by_one_error {

    public static void main(String[] args) {
        int n, sum = 0;
        for (n = 1; n < 10; n++) {                              // Off by one
            sum = sum + n;
            System.out.println("n==" + n + "; sum==" + sum);    // trace
        }
        System.out.println("1 + 2 + ...+ 9 + 10 == " + sum);
    }
}
