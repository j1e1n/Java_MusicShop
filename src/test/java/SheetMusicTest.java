import items.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    private SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic("sheet music", 8.00, 10.00);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(2.00, sheetMusic.calculateMarkup(), 0.0);
    }

}
