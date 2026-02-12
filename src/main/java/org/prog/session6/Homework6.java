package org.prog.session6;

import org.prog.session6.Car;

//TODO: add car plate number
//TODO: add method which will return owner name, model and plate number
//TODO: use String to store and print this in Main

public class Homework6 {

    public static void main(String[] args)
    {
        Car car = new Car();


        car.carOwner = "Leo";
        car.carModel = "Tesla";
        car.plateNum = "AP534M";

        String info = car.InformationCar();
        System.out.println(info);


    }
}
