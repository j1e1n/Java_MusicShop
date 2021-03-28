package instruments;

import behaviours.IPlay;

public class Bodhran extends Instrument implements IPlay {

    private String material;

    public Bodhran(String description, Double buyPrice, Double sellPrice, String size, InstrumentType type, String material) {
        super(description, buyPrice, sellPrice, size, type);
        this.material = material;
    }


    public String play() {
        return "thud thud";
    }

}
