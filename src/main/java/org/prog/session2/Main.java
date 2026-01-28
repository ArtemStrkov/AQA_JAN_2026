package org.prog.session2;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        int i = 20;
        int j = 20;

        //IF-ELSE
//        if (i >= j) {
//            System.out.println("I IS GREATER OR EQUAL THAT J");
//        } else {
//            System.out.println("NOPE");
//        }
//
//        if (i == j && i != 20) {
//            System.out.println("WORKS ONLY IF CONDITIONS ARE MET");
//        }

        if (i > j || i == 20) {
            System.out.println("I IS GREATER THAN J");
        } else if (i == j || i == 20) {
            System.out.println("I EQUALS J");
        } else {
            System.out.println("I IS LESS THAN J");
        }


        //AND
//        System.out.println(i > j);
//        System.out.println(i < j);
//        System.out.println(i >= j);
//        System.out.println(i <= j);
//        System.out.println(i == 10 && j == 20);
//        System.out.println(i == 10 && j == 20 && i * 2 == j);
//        System.out.println(i != 10 && j == 20 && i * 2 == j);
//        //OR
//        System.out.println("=============OR===============");
//        System.out.println(i == 15 || j == 20);
//        System.out.println(i == 10 || j == 15);
//        System.out.println(i == 11 || j == 15);
//        System.out.println(i == 11 || j == 15 || i * 2 == j);
//
//        //AND + OR
//        System.out.println("================== AND+ OR ====================");
//        System.out.println((i == 10 && j == 15) || (i == 10 && j == 20));
//
//        System.out.println((i == 11 || j == 15) && (i == 10 && j == 22));
//        System.out.println(i == 11 || j == 15 && i == 10 && j == 22);
//        //THESE TWO ARE THE SAME
//        System.out.println(false || false && true && false);
//
//        System.out.println(i == 11 && j == 15 && i == 10 || j == 22);

        // 1 == 1 -> TRUE
        // 1 != 1 -> FALSE
        // 1 != 2 -> TRUE
        // 1 == 2 -> FALSE


//        System.out.println(i == j); //false
//        System.out.println(i*2 == j); // true
//        System.out.println(i != j); //true
//        System.out.println(i*2 != j); //false
//
//        BigDecimal bd = new BigDecimal("123.45");
//        float f = 123.45F;

//        boolean b1 = true;
//        boolean b2 = false;
//
//        byte b3 = 0;
//        short s1 = 1;
//        int s2 = 2;
//        long l1 = 1;
//
//        double d1 = 1.00000001D;
//        float f1 = 1.000000000001F;
//
//        System.out.println(d1);
//        System.out.println(f1);
//
//        char c1 = 'a';

//        System.out.println("String value".equals("String value"));
//        System.out.println("String value".equals("String value 1"));

    }
}
