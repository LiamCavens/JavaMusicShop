import instruments.Bagpipe;
import instruments.InstrumentType;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    private Piano piano;
    private Bagpipe bagpipe;

    @Before
    public void setUp() {
        piano = new Piano("Piano", 120, 240, "Yamaha", "Grand", "Black", "Plasticine", InstrumentType.KEYBOARD, 3);
        bagpipe = new Bagpipe("Something you blow on", 100, 200, "Wallace", "Large", "Brown", "Sheepskin", InstrumentType.WOODWIND, "Blackwatch");
    }

    @Test
    public void hasDescription() {
        assertEquals("Piano", piano.getDescription());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(120, piano.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(240, piano.getSellPrice(), 0.01);
    }

    @Test
    public void hasMake() {
        assertEquals("Yamaha", piano.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("Grand", piano.getModel());
    }

    @Test
    public void hasColour() {
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Plasticine", piano.getMaterial());
    }

    @Test
    public void hasFamily() {
        assertEquals(InstrumentType.KEYBOARD, piano.getType());
    }

    @Test
    public void hasPedels() {
        assertEquals(3, piano.getPedals());
    }

    @Test
    public void canPlay() {
        System.out.println(bagpipe.play());
        assertEquals("Screaming Giraffe noises", bagpipe.play());
    }
}
