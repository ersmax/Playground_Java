/*
Fix the bug in the code in the earlier subsection “Tracing Variables.”
 */

package chapter3.Section4_Debugging;

public class Ex_3_40_Tracing_variables {

    public static void main(String[] args) {
        int n = 10;
        int sum = 10;
        while (n > 1) {
            n--;
            sum += n;
        }
        System.out.println("The sum of integers 1 to 10 is " + sum);
    }
}
