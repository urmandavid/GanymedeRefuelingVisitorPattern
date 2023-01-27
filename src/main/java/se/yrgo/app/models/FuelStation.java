package se.yrgo.app.models;

import se.yrgo.app.Visitor;
import lombok.Getter;

/**
 * A client class representing a Fuel station.
 */
@Getter
public class FuelStation extends Client {
    private final boolean droneFlight;

    public FuelStation(String name, String coords, String regNum, boolean droneFlight) {
        super(name, coords, regNum);
        this.droneFlight = droneFlight;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
