package se.yrgo.app.models;

import se.yrgo.app.Visitor;
import lombok.Data;

/**
 * The abstract parent class Client.
 */
@Data
public abstract class Client {
    private final String name;
    private final String coords;
    private final String regNum;

    public abstract void accept(Visitor visitor);
}
