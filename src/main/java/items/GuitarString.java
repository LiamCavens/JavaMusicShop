package items;

import behaviors.Sellable;

public class GuitarString extends items.Item implements Sellable{

    public GuitarString(String description, double buyPrice, double sellPrice) {
        super(description, buyPrice, sellPrice);
    }
}
