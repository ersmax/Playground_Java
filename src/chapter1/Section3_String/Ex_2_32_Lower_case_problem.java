/*
The following code is supposed to output the string in lowercase letters but it
has an error. What is wrong?
String test = "WHY ARE YOU SHOUTING?";
test.toLowerCase();
System.out.println(test);
 */

package chapter1.Section3_String;

public class Ex_2_32_Lower_case_problem {
    public static void main(String[] args) {
        String test = "WHY ARE YOU SHOUTING?";
        test = test.toLowerCase(); // missing the assignment of the result to 'test'
        System.out.println(test);
    }
}
