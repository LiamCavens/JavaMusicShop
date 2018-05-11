package instruments;

import behaviors.Playable;

public class Bagpipe extends Instrument implements Playable {

    String bagTartan;

    public Bagpipe(String description, double buyPrice, double sellPrice, String make, String model, String colour, String material, String bagTartan) {
        super(description, buyPrice, sellPrice, make, model, colour, material, InstrumentType.WOODWIND);
        this.bagTartan = bagTartan;
    }

    public String play(){
        return "Screaming Giraffe noises";
    }

    public String getBagTartan() {
        return bagTartan;
    }
}
