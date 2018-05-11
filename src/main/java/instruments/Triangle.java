package instruments;

public class Triangle extends Instrument{

    boolean hasMetalBeater;

    public Triangle(String description, double buyPrice, double sellPrice, String make, String model, String colour, String material, boolean hasMetalBeater) {
        super(description, buyPrice, sellPrice, make, model, colour, material, InstrumentType.PERCUSSION);
        this.hasMetalBeater = hasMetalBeater;
    }

    public String play() {
        return "Tiiiiinnggggggggg";
    }

    public boolean isHasMetalBeater() {
        return hasMetalBeater;
    }
}
