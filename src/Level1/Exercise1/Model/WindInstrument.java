package Level1.Exercise1.Model;

public class WindInstrument extends Instrument {

    public WindInstrument(String name, double price) {
        super(name, price);
    }

    static {
        System.out.println("WindInstrument class loaded");
    }
    {
        System.out.println("WindInstrument instance created");
    }

    @Override
    public void play() {
        System.out.println("Playing the wind instrument: " + getName() + " (" + getPrice() + "€)");
    }
}
