import instruments.Bodhran;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BodhranTest {

    private Bodhran bodhran;

    @Before
    public void before(){
        bodhran = new Bodhran("bodhran", 10.00, 12.00, "small", InstrumentType.PERCUSSION, "goat skin");
    }

    @Test
    public void canPlay(){
        assertEquals("thud thud", bodhran.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(2.00, bodhran.calculateMarkup(), 0.0);
    }

}
