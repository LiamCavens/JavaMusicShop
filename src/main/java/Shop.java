import items.Item;

import java.util.ArrayList;

public class Shop {

    String name;
    double till;
    ArrayList<Item> stock;

    public Shop(String name, double till) {
        this.name = name;
        this.till = till;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getTill() {
        return till;
    }

    public ArrayList<Item> getStock() {
        ArrayList<Item> stockCopy = new ArrayList<>(stock);
        return stockCopy;
    }

    public void addToStock(Item item){
        this.stock.add(item);
        this.till -= item.getBuyPrice();
    }

    public void sellToCustomer(Customer customer, Item item){
        this.stock.remove(item);
        customer.purchaseItem(item);
        this.till += item.getSellPrice();
    }
}
