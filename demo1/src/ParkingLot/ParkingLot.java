package ParkingLot;

import java.util.List;

public class ParkingLot {
    private String name;
    private boolean available;
    private List<Level> levelList;
    private int availableSpotNumber;

    public ParkingLot(String name, boolean available, List<Level> levelList, int availableSpotNumber) {
        this.name = name;
        this.available = available;
        this.levelList = levelList;
        this.availableSpotNumber = availableSpotNumber;
    }

    public void enter(Vehicle vehicle) {

    }

    public Level findAvailableLevel() {
        return null;
    }

    public int getAvailableSpotNumber() {
        return availableSpotNumber;
    }

    public void updateAvailableSpotNumber() {

    }

    public Ticket exit(Vehicle vehicle) {
        return null;
    }
}
