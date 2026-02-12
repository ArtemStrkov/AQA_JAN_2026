package org.prog.session6;

//TODO: add car plate number
//TODO: add method which will return owner name, model and plate number

public class Car {

    public String carModel;
    public String carOwner;
    //public String milege;
    public String plateNum;

    public String InformationCar() {

        return "Car owner: " + carOwner + " | model: " + carModel + " | plate: " + plateNum;

    }

}
