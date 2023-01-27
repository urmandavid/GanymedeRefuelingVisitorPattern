package se.yrgo.app.models;

import se.yrgo.app.Visitor;
import lombok.Getter;

/**
 * A client class representing a Spaceship.
 */
@Getter
public class Spaceship extends Client {
    private final String spaceshipClass;

    public Spaceship(String name, String coords, String regNum, String spaceshipClass) {
        super(name, coords, regNum);
        this.spaceshipClass = spaceshipClass;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
