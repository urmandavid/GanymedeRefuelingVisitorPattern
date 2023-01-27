package se.yrgo.app;

import se.yrgo.app.models.*;
import java.util.List;

/**
 * A simple App to show the Visitor Design Pattern.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("\nHello Solar System, time to refuel!" +
                "\nSending refueling messages by interplanetary mail...\n");

        List<Client> clients = List.of(
                new Spaceship("MCRN Rocinante", "11.16.41.32",
                        "ECF-270", "C"),
                new FuelStation("Ganymede Station Refueling Co.",
                        "12.41.30.52", "GFS-123", true),
                new RefuelDrone("GanymedeFuelDroneOne",
                        "11.16.41.29", "GFD-001", false)
        );
        // Calling the RefuelMessagingAgent (Visitor class) implementing Visitor interface ...
        RefuelMessagingAgent refuelingMessageVisitor = new RefuelMessagingAgent();
        refuelingMessageVisitor.sendRefuelingMails(clients);
    }
}
