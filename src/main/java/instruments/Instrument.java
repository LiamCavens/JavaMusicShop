package instruments;

import items.Item;

public abstract class Instrument extends Item {

    String make;
    String model;
    String colour;
    String material;
    InstrumentType type;

    public Instrument(String description, double buyPrice, double sellPrice, String make, String model, String colour, String material, InstrumentType type) {
        super(description, buyPrice, sellPrice);
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.material = material;
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }

    public InstrumentType getType() {
        return type;
    }
}
