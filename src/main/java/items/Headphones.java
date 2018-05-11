package items;

import behaviors.Sellable;

public class Headphones extends items.Item implements Sellable{

    public Headphones(String description, double buyPrice, double sellPrice) {
        super(description, buyPrice, sellPrice);
    }
}
