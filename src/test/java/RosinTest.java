import items.Rosin;
import items.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RosinTest {

    private Rosin rosin;

    @Before
    public void before(){
        rosin = new Rosin("rosin", 2.00, 5.00);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(3.00, rosin.calculateMarkup(), 0.0);
    }

}
