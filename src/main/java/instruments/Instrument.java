package instruments;

import behaviours.ISell;
import items.Items;


public abstract class Instrument extends Items implements ISell {

    private String size;
    private InstrumentType type;

    public Instrument(String description, Double buyPrice, Double sellPrice, String size, InstrumentType type) {
        super(description, buyPrice, sellPrice);
        this.size = size;
        this.type = type;
    }
}
