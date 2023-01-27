package se.yrgo.app;

import se.yrgo.app.models.*;
import java.util.List;

/**
 * The Refuel Messaging Agent, implementing the Visitor interface.
 */
public class RefuelMessagingAgent implements Visitor {

    public void sendRefuelingMails(List<Client> clients) {
        for (Client client : clients) {
            client.accept(this);
        }
    }

    public void visit(Spaceship spaceship) {
        System.out.println("Sending refueling mail to " + spaceship.getName()
                + " | With coords: " + spaceship.getCoords()
                + " | Class: " + spaceship.getSpaceshipClass());
    }

    public void visit(FuelStation fuelStation) {
        System.out.println("Sending refueling mail to " + fuelStation.getName()
                + " | With coords: " + fuelStation.getCoords()
                + " | Refueling drone in flight? -> '" + fuelStation.isDroneFlight() + "'");
    }

    public void visit(RefuelDrone refuelDrone) {
        System.out.println("Sending refueling mail to " + refuelDrone.getName()
                + " | With coords: " + refuelDrone.getCoords()
                + " | Docking sequence initiated? -> '" + refuelDrone.isDockingSequence() + "'");
    }
}
