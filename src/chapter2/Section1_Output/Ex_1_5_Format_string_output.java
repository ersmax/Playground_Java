/*
What output is produced by the following code?
String aString = "Jelly beans";
System.out.println("START1234567890");
System.out.printf("START%sEND %n", aString);
System.out.printf("START%4sEND %n", aString);
System.out.printf("START%13sEND %n", aString);
System.out.println();
 */

package chapter2.Section1_Output;

public class Ex_1_5_Format_string_output {
    public static void main(String[] args) {
        String aString = "Jelly beans";
        System.out.println("START1234567890");
        System.out.printf("START%sEND %n", aString); // STARTJelly beansEND /n
        System.out.printf("START%4sEND %n", aString); // STARTJelly beansEND /n
        System.out.printf("START%13sEND %n", aString); // START  Jelly beansEND /n
        System.out.println();
    }
}
