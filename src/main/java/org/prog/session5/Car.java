package org.prog.session5;

public class Car {

    public String owner;
    public String destination;
    public int speed;

    public void goTo(String owner, String destination, int speed)
    {

        System.out.println("car owned by " + owner + " is going to " + destination + " at " + speed + " km/h");

//        System.out.println("before trip miles: " + mileage);
//        if ("black".equals(color)) {
//            System.out.println("Black cars are cool");
//        }
//        mileage += speed * 10;
//        System.out.println(color + " car is going to " + destination +
//                " at " + speed + " km/h");
//        System.out.println("After trip miles: " + mileage);
    }
}
