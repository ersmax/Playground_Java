/*
What output is produced by the following code? For each output line, describe
whether the line begins or ends with a blank or blanks.
String aString = "Jelly beans";
double d = 123.1234567890;
System.out.println("START1234567890");
System.out.printf("START%sEND %n %9.4f %n", aString, d);
 */

package chapter2.Section1_Output;

public class Ex_1_6_Format_specifier {
    public static void main(String[] args) {
        String aString = "Jelly beans";
        double d = 123.1234567890;
        System.out.println("START1234567890");
        System.out.printf("START%sEND %n %9.4f %n", aString, d);
        // Output:
        // START1234567890
        // STARTJelly beansEND
        //   123,1235
        // The first line does not begin or end with a blank.
        // The second line does not begin with a blank.
        // The third line begins with 2 blanks and ends with a blank and carriage return.
    }
}
