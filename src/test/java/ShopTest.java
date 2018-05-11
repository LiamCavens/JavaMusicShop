import instruments.Bagpipe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Bagpipe bagpipe;
    Customer customer;

    @Before
    public void setUp() {
        shop = new Shop("Upul's Top Tunes Music Shop", 1000);
        bagpipe = new Bagpipe("Something you blow on", 100, 200, "Wallace", "Large", "Brown", "Sheepskin", "Blackwatch");
        customer = new Customer("Aldo", 500);

        shop.addToStock(bagpipe);
    }

    @Test
    public void shopHasName() {
        assertEquals("Upul's Top Tunes Music Shop", shop.getName());
    }

    @Test
    public void shopHasTill() {
        assertEquals(900, shop.getTill(), 0.01);
    }

    @Test
    public void shopHasStock() {
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void shopPaysForStock() {
        assertEquals(900, shop.getTill(), 0.01);
    }

    @Test
    public void purchaseHappens() {
        shop.sellToCustomer(customer, bagpipe);
        assertEquals(0, shop.getStock().size());
        assertEquals(1, customer.getPurchases().size());
        assertEquals(1100, shop.getTill(), 0.01);
        assertEquals(300, customer.getWallet(), 0.01);
    }
}
