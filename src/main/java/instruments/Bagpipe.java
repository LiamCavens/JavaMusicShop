package instruments;

import behaviors.Playable;

public class Bagpipe extends Instrument implements Playable {

    String bagTartan;

    public Bagpipe(String description, double buyPrice, double sellPrice, String make, String model, String colour, String material, InstrumentType type, String bagTartan) {
        super(description, buyPrice, sellPrice, make, model, colour, material, type);
        this.bagTartan = bagTartan;
    }

    public String play(){
        return "Screaming Giraffe noises";
    }
}
