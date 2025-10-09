package Level2.Exercise1;

import Level2.Exercise1.Model.Smartphone;

public class Main {
    public static void main(String[] args) {

        // Create a Smartphone object
        Smartphone mySmartphone = new Smartphone("Xiaomi", "Redmi note 12");

        // Use Phone functionality
        mySmartphone.call("123-456-7890");

        // Use Camera functionality
        mySmartphone.takePhoto();

        // Use Clock functionality
        mySmartphone.alarm();
    }
}
