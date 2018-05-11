import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Piano piano;

    @Before
    public void setUp() {
        customer = new Customer("Donald", 540);
        piano = new Piano("Piano", 120, 240, "Yamaha", "Grand", "Black", "Plasticine", 3);
    }

    @Test
    public void hasName() {
        assertEquals("Donald", customer.getName());
    }

    @Test
    public void hasWallet() {
        assertEquals(540, customer.getWallet(), 0.01);
    }

    @Test
    public void canAddToPurchases() {
        customer.purchaseItem(piano);
        assertEquals(1, customer.getPurchases().size());
    }

    @Test
    public void paysForPurchase() {
        customer.purchaseItem(piano);
        assertEquals(300, customer.getWallet(), 0.01);
    }
}
