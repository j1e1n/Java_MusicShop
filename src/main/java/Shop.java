import behaviours.ISell;
import instruments.Violin;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<ISell>();
    }

    public void addItemToStock(ISell item) {
        stock.add(item);
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }
}
