import items.SheetMusic;
import items.ValveOil;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValveOilTest {

    private ValveOil valveOil;

    @Before
    public void before(){
        valveOil = new ValveOil("valve oil", 5.00, 10.00);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(5.00, valveOil.calculateMarkup(), 0.0);
    }

}
