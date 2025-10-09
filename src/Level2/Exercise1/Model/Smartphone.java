package Level2.Exercise1.Model;

import Level2.Exercise1.Interfaces.Camera;
import Level2.Exercise1.Interfaces.Clock;

// Class that represents a smartphone combining phone, camera, and clock functionalities
public class Smartphone extends Phone implements Camera, Clock {

    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void takePhoto() {
        System.out.println("Taking a photo with " + getBrand() + " " + getModel());
    }

    @Override
    public void alarm() {
        System.out.println("The alarm is playing");
    }
}
