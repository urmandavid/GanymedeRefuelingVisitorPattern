package se.yrgo.app.models;

import se.yrgo.app.Visitor;
import lombok.Getter;

/**
 * A client class representing a Refueling drone.
 */
@Getter
public class RefuelDrone extends Client {
    private final boolean dockingSequence;

    public RefuelDrone(String name, String coords, String regNum, boolean dockingSequence) {
        super(name, coords, regNum);
        this.dockingSequence = dockingSequence;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
