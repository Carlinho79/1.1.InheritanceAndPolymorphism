package Level1.Exercise2.Model;

public class Car {
    // 🔹 Attributes
    // static final → can't be change and is the same for every instance
    private static final String BRAND = "Tesla";
    // static → Can be changed in every object, but is the same for all instances at a given time
    private static String model;
    // final →  can be different in every object but can't be changed on the instance after construction
    private final int power;

    // 🔹 Constructor
    public Car(String model, int power) {
        Car.model = model; // static attribute can be changed in every object but affects all instances
        this.power = power; // final attribute assigned during construction
    }

    public static String BRAND() {
        return BRAND;
    }

    public static String getModel() {
        return model;
    }

    public static void setModel(String model) {
        Car.model = model;
    }

    public int getPower() {
        return power;
    }

    // 🔹 Static Method
    public static void brake() {
        System.out.println("Vehicle is braking");
    }

    // 🔹 Non-Static Method
    public void accelerate() {
        System.out.println("Vehicle, " + getModel() + " (" + getPower() + " HP), is accelerating");
    }

}
