package Level1.Exercise1.Model;

public class PercussionInstrument extends Instrument {

    public PercussionInstrument(String name, double price) {
        super(name, price);
    }

    static {
        // This block runs only once when the class is loaded into memory
        System.out.println("PercussionInstrument class loaded");
    }
    {
        // This block runs every time an instance is created
        System.out.println("PercussionInstrument instance created");
    }

    @Override
    public void play() {
        System.out.println("Playing the percussion instrument: " + getName() + " (" + getPrice() + "€)");
    }

}
