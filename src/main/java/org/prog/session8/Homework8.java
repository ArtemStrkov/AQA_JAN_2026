package org.prog.session8;

public class Homework8 {

    public static void main(String[] args)
    {

        Android samsung = new Android("Samsung S+", "Black");
        Apple iphone = new Apple("iPhone 12", "White");

        iphone.call("Artem");
        iphone.unlockScreen();
        System.out.println("////////////////////////////////");
        samsung.call("Sasha");
        samsung.unlockScreen();

    }
}
