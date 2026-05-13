/*
Use the method Math.random() to generate a random double that is greater
than or equal to 10.0 but less than 20.0.
 */

package chapter3.Section5_Random;

import java.text.DecimalFormat;

public class Ex_3_46_Random_Math_class {

    public static void main(String[] args) {

        double random = Math.random() * 10 + 10;

        DecimalFormat pattern0dot00 = new DecimalFormat("0.00");
        System.out.println(pattern0dot00.format(random));
    }
}
