/*
Given the following fragment that purports to convert from degrees Celsius to
degrees Fahrenheit, answer the following questions:
double celsius = 20;
double fahrenheit;
fahrenheit = (9 / 5) * celsius + 32.0;
a. What value is assigned to fahrenheit?
b. Explain what is actually happening, and what the programmer likely wanted.
c. Rewrite the code as the programmer intended.
*/

// Answer:
// a. The value assigned to fahrenheit is 52.0.
// b. The expression (9 / 5) performs integer division, which results in 1 instead of 1.8.
//    Therefore, the calculation becomes 1 * celsius + 32.0, which equals 52.0 when celsius is 20.
// c. The code can be rewritten as follows to achieve the intended conversion:
//    fahrenheit = (9 / 5.0) * celsius + 32.0;

package chapter1.Section2_Expressions;

public class Ex_2_21_Ouput_4 {
    public static void main(String[] args) {
        double celsius = 20;
        double fahrenheit;
        fahrenheit = (9 / 5) * celsius + 32.0;
        System.out.println("Fahrenheit: " + fahrenheit);  // Fahrenheit: 52.0
        fahrenheit = (9 / 5.0) * celsius + 32.0;
        System.out.println("Fahrenheit: " + fahrenheit);  // Fahrenheit: 68.0
    }
}
