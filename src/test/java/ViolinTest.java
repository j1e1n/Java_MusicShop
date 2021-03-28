import instruments.InstrumentType;
import instruments.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {


    private Violin violin;

    @Before
    public void before() {
        violin = new Violin("violin", 8000.00, 10000.00, "full", InstrumentType.STRING, 4);
    }

    @Test
    public void canPlay(){
        assertEquals("fiddle dee dee", violin.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(2000.00, violin.calculateMarkup(), 0.0);
    }
}
