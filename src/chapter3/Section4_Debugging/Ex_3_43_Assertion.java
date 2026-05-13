/*
Write an assertion check that checks to see that the value of the variable time is
less than or equal to the value of the variable limit. Both variables are of type int.
Generating
Random
 */

package chapter3.Section4_Debugging;

public class Ex_3_43_Assertion {

    public static void main(String[] args) {
        int time = 10, limit = 100;
        assert (time <= limit);
    }
}
