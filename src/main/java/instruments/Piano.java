package instruments;

import behaviors.Playable;

public class Piano extends instruments.Instrument implements Playable {

    int pedals;

    public Piano(String description, double buyPrice, double sellPrice, String make, String model, String colour, String material, InstrumentType type, int pedals) {
        super(description, buyPrice, sellPrice, make, model, colour, material, type);
        this.pedals = pedals;
    }

    public String play() {
        return "Plink plonk";
    }

    public int getPedals() {
        return pedals;
    }
}
