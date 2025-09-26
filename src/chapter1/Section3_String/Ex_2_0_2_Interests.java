package chapter1.Section3_String;

/**
 Program that shows interest on a sample account balance
*/
public class Ex_2_0_2_Interests {
    public static final double INTEREST_RATE = 2.5;

    public static void main(String[] args) {
        double balance = 100.0;
        double interest;

        interest = balance * (INTEREST_RATE / 100.0);
        System.out.println("On a balance of $"
                + balance + "\n"
                + "you will earn interest of $"
                + interest + "\n"
                + "all in one short year.");
    }

}
