package instruments;

import behaviours.IPlay;

public class Violin extends Instrument implements IPlay {

    private int numberOfStrings;

    public Violin(String description, Double buyPrice, Double sellPrice, String size, InstrumentType type, int numberOfStrings) {
        super(description, buyPrice, sellPrice, size, type);
        this.numberOfStrings = numberOfStrings;
    }


    public String play() {
        return "fiddle dee dee";
    }

}
