import behaviours.ISell;

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

    public void removeItemFromStock(ISell item) {
        stock.remove(item);
    }
}
