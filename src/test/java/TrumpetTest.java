import instruments.InstrumentType;
import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {


    private Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet("trumpet", 150.00, 199.00, "regular", InstrumentType.BRASS, 3);
    }

    @Test
    public void canPlay(){
        assertEquals("toot toot", trumpet.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(49.00, trumpet.calculateMarkup(), 0.0);
    }
}
