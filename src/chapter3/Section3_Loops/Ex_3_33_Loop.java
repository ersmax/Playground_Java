
/*
What is the output of the following loop? Comment on the code. (This is not
the same as the previous exercise.)
int n = 1024;
int log = 0;
for (int i = 1; i < n; i = i * 2);
log++;
System.out.println(n + " " + log);
 */

/*
1024 1
 */

package chapter3.Section3_Loops;

public class Ex_3_33_Loop {
    public static void main(String[] args) {
        int n = 1024;
        int log = 0;
        for (int i = 1; i < n; i = i * 2);
        log++;
        System.out.println(n + " " + log);
    }
}
