import instruments.InstrumentType;
import instruments.Violin;
import items.Rosin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private Violin violin;
    private Rosin rosin;

    @Before
    public void before(){
        shop = new Shop();
        violin = new Violin("violin", 8000.00, 10000.00, "full", InstrumentType.STRING, 4);
        rosin = new Rosin("rosin", 2.00, 5.00);
    }

    @Test
    public void canAddItemToShop(){
        shop.addItemToStock(violin);
        shop.addItemToStock(rosin);
        assertEquals(2, shop.getStock().size());
    }

}
