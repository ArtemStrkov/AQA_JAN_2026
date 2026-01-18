package org.prog.session2;

import java.security.KeyStore;
import java.util.Random;

public class HomeWork2 {

    //TODO: write cycle where:
    // - On each cycle generate random i and random j up to 1000
    // - If (i - j) % 7 -> stop the cycle (use break)+

    public static void main(String[] args)
    {
        Random r = new Random();

        while (true)
        {
            int i = r.nextInt(1000);
            int j = r.nextInt(1000);
            int answer = (i - j) % 7;

            System.out.println("i = " + i);
            System.out.println("j = " + j);
            System.out.println("(" + i + " - " + j + ")" + " % " + "7" + " = " + answer);

            if (answer == 0)
            {
                System.out.println("The numbers are divided without a remainder, the cycle is stopped.");
               break;
            }

            System.out.println("////////////////////////");
        }
    }


}
