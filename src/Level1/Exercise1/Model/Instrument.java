package Level1.Exercise1.Model;

public abstract class Instrument {
    private String name;
    private double price;

    public Instrument(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    static {
        System.out.println("Instrument class loaded");
    }

    {
        System.out.println("Instrument instance created");
    }

    public abstract void play();
}
