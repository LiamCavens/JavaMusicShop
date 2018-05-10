package items;

import behaviors.Sellable;

public abstract class Item implements Sellable {

    String description;
    double buyPrice;
    double sellPrice;

    public Item(String description, double buyPrice, double sellPrice) {
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getDescription() {
        return description;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void sell(){
        //add something here when Shop Class is created.
    }
}
