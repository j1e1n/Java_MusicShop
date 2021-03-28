package items;

import behaviours.ISell;

public abstract class Items implements ISell {

    private String description;
    private Double buyPrice;
    private Double sellPrice;

    public Items(String description, Double buyPrice, Double sellPrice) {
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public Double calculateMarkup() {
        return sellPrice - buyPrice;
    }




}
