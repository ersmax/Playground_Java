package chapter3.Section5_Random;

import java.util.Random;

public class Ex_3_0_7_HeadTails {

    public static final int N_TOSSES = 5;
    public static final int COIN_FACES = 2;

    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int counter = 1;

        while (counter <= N_TOSSES) {
            System.out.print("Flip number " + counter + ": ");
            int coinFlip = randomGenerator.nextInt(COIN_FACES);
            if (coinFlip == 1)
                System.out.println("Heads");
            else
                System.out.println("Tails");
            counter++;
        }
    }
}
