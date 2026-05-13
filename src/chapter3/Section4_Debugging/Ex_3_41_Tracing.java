/*
Add some suitable output statements to the following code so that all variables
are traced:
int n, sum = 0;
for (n = 1; n < 10; n++)
sum = sum + n;
System.out.println("1 + 2 + ...+ 9 + 10 == " + sum);
 */

package chapter3.Section4_Debugging;

public class Ex_3_41_Tracing {

    public static void main(String[] args) {
        int n, sum = 0;
        for (n = 1; n < 10; n++) {
            sum = sum + n;
            System.out.println("n == " + n + " sum == " + sum); // trace
        }
        System.out.println("After loop:");                      // trace
        System.out.println("n == " + n + " sum == " + sum);     // trace
        System.out.println("1 + 2 + ...+ 9 + 10 == " + sum);
    }
}
