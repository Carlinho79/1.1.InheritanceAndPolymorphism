package Level1.Exercise1.Model;

public class StringInstrument extends Instrument {

    public StringInstrument(String name, double price) {
        super(name, price);
    }

    static {
        System.out.println("StringInstrument class loaded");
    }
    {
        System.out.println("StringInstrument instance created");
    }

    @Override
    public void play() {
        System.out.println("Playing the string instrument: " + getName() + " (" + getPrice() + "€)");
    }

}
