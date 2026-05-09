/*
Rewrite the following for statement as a while loop (and possibly some
additional statements):
int n;
for (n = 10; n > 0; n = n - 2)
System.out.println("Hello " + n);
 */

package chapter3.Section3_Loops;

public class Ex_3_31_Loop {

    public static void main(String[] args) {
        int n = 10;
        while (n > 0) {
            System.out.println("Hello " + n);
            n -= 2;
        }
    }
}
