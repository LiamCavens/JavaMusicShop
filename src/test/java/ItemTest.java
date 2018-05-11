import items.MetalBeater;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    MetalBeater metalBeater;

    @Before
    public void setUp() {
        metalBeater = new MetalBeater("Stick used to hit triangle", 0.50, 2);
    }

    @Test
    public void hasDescription() {
        assertEquals("Stick used to hit triangle", metalBeater.getDescription());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(0.50, metalBeater.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(2, metalBeater.getSellPrice(), 0.01);
    }
}
