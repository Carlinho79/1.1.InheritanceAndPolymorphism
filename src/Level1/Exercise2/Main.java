package Level1.Exercise2;

import Level1.Exercise2.Model.Car;

public class Main {
    public static void main(String[] args) {

        System.out.println("---- DEMO STATICS AND FINALS VARIABLES ----");

        // Access static final attribute
        System.out.println("Brand: " + Car.BRAND());


        // Create different instances of Car
        Car car1 = new Car("Model S", 670);
        Car car2 = new Car("Model 3", 480);


        // 3️⃣ Access model and power attributes through instances
        System.out.println("Car 1 → model: " + car1.getModel() + ", power: " + car1.getPower() + " HP");
        System.out.println("Car 2 → model: " + car2.getModel() + ", power: " + car2.getPower() + " HP");
        // Note: Car.model is static, so it reflects the last assigned value ("Model 3"), can be access it through
                    //  instances, but it will be the same for all instances (That's why it's commented)
        // Note: if I try 'car1.power = 700;', this would cause a compilation error because power is final

        // Call static method (without creating an instance)
        Car.brake();

        // Call non-static method (it needs an instance)
        car1.accelerate();
        car2.accelerate();
    }
}
