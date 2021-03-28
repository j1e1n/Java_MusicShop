package instruments;

import behaviours.IPlay;

public class Trumpet extends Instrument implements IPlay {

    private int numberOfValves;

    public Trumpet(String description, Double buyPrice, Double sellPrice, String size, InstrumentType type, int numberOfValves) {
        super(description, buyPrice, sellPrice, size, type);
        this.numberOfValves = numberOfValves;
    }

    public String play() {
        return "toot toot";
    }
}
