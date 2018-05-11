package items;

import behaviors.Sellable;

public class MetalBeater extends items.Item implements Sellable{

    public MetalBeater(String description, double buyPrice, double sellPrice) {
        super(description, buyPrice, sellPrice);
    }
}
