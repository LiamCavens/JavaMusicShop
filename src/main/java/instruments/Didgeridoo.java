package instruments;

public class Didgeridoo extends Instrument {

    double length;

    public Didgeridoo(String description, double buyPrice, double sellPrice, String make, String model, String colour, String material, double length) {
        super(description, buyPrice, sellPrice, make, model, colour, material, InstrumentType.WOODWIND);
        this.length = length;
    }

    public String play() {
        return "Brrruuuuuubrruururuurbuuuuu";
    }

    public double getLength() {
        return length;
    }
}
