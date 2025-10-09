package Level2.Exercise1.Model;

public class Phone {
    private String brand;
    private String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void call(String number) {
        System.out.println("Calling " + number + " from " + brand + " " + model);
    }

}
