import items.Item;

import java.util.ArrayList;

public class Customer {

    String name;
    double wallet;
    ArrayList<Item> purchases;

    public Customer(String name, double wallet) {
        this.name = name;
        this.wallet = wallet;
        this.purchases = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getWallet() {
        return wallet;
    }

    public ArrayList<Item> getPurchases() {
        ArrayList<Item> purchasesCopy = new ArrayList<>(purchases);
        return purchasesCopy;
    }

    public void purchaseItem(Item item){
        this.purchases.add(item);
        this.wallet -= item.getSellPrice();
    }
}
