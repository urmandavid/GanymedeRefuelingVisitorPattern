package se.yrgo.app;

import se.yrgo.app.models.*;

/**
 * The Visitor interface.
 */
public interface Visitor {
    void visit(Spaceship spaceship);
    void visit(FuelStation fuelStation);
    void visit(RefuelDrone refuelDrone);
}
