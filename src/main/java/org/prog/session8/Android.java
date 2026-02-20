package org.prog.session8;
import java.util.Objects;

//TODO: Add at least 2 classes that implement phones: Android and Apple
//TODO: Both Apple and Android (or others) must implement IPhone
//TODO: Both Apple and Android must have model and color
//TODO: Add equals and hashcode for both

public class Android implements Iphone {

    public String model;
    public String color;

    public Android(String model1, String color1) {
           model = model1;
           color = color1;
    }

    public void call(String someone) {
        System.out.println("Android is calling " + someone);
    }


    public void unlockScreen() {
        System.out.println("Android screen unlocked");
    }

    public boolean equals(Object obj)
    {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        Android otherPhone = (Android) obj;

        if (!this.model.equals(otherPhone.model)) {
            return false;
        }

        if (!this.color.equals(otherPhone.color)) {
            return false;
        }

        return true;


    }

    public int hashCode() {
        return Objects.hash(model, color);
    }

}
