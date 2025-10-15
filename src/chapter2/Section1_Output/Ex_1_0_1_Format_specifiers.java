/*
Some examples of format specifiers in Java with printf library.
 */

package chapter2.Section1_Output;

public class Ex_1_0_1_Format_specifiers {
    public static void main(String[] args) {
        String aString = "abc";

        System.out.println("String output:");
        System.out.println("START1234567890");
        System.out.printf("START%sEND %n", aString); // STARTabcEND /n
        System.out.printf("START%4sEND %n", aString); // START abcEND /n
        System.out.printf("START%2sEND %n", aString); // STARTabcEND /n
        System.out.println();

        char oneCharacter = 'Z';
        System.out.println("Character output:");
        System.out.println("START1234567890");
        System.out.printf("START%cEND %n", oneCharacter); // STARTZEND /
        System.out.printf("START%4cEND %n", oneCharacter); // START   ZEND /n
        System.out.println();

        double d = 12345.123456789;

        System.out.println("Floating-point output:");
        System.out.println("START12345678901234567890");
        System.out.printf("START%fEND %n", d); // START12345,123457END /n (%.6f by default)
        System.out.printf("START%.4fEND %n", d); // START12345,1235END /n
        System.out.printf("START%.2fEND %n", d); // START12345,12END /n
        System.out.printf("START%12.4fEND %n", d); // START  12345,1235END /n
        System.out.printf("START%eEND %n", d); // START1,234512e+04END /n (%.6e by default)
        System.out.printf("START%12.5eEND %n", d); // START 1,23451e+04END /n (12 characters wide, 5 after decimal)
    }
}
