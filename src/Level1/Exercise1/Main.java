package Level1.Exercise1;

import Level1.Exercise1.Model.Instrument;
import Level1.Exercise1.Model.PercussionInstrument;
import Level1.Exercise1.Model.StringInstrument;
import Level1.Exercise1.Model.WindInstrument;

public class Main {
    public static void main(String[] args) {

        System.out.println("---- DEMO STATIC AND INITIALIZING BLOCK ----");

        // 🔹 1.  Loading Instrument classes without objects
        System.out.println(Instrument.class);

        // 🔹 2. Creating instances
        System.out.println("\n---- Creating objects ----");
        Instrument flute = new WindInstrument("Flute", 120.50);
        Instrument guitar = new StringInstrument("Guitar", 350.75);
        Instrument drums = new PercussionInstrument("Drums", 200.00);

        // 🔹 3. Trying polymorphism
        System.out.println("\n---- Trying play method ----");
        flute.play();
        guitar.play();
        drums.play();
    }
}
