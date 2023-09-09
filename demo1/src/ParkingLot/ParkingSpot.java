package ParkingLot;

public abstract class ParkingSpot {
    protected final ParkingSpotType type;
    protected String spotNo;
    protected Level level;
    protected boolean available;
    protected Vehicle vehicle;

    public ParkingSpot(ParkingSpotType type) {
        this.type = type;
    }

    public boolean isAvailable() {
        return available;
    }

    public void takeSpot(Vehicle vehicle) {
        this.vehicle = vehicle;
        available = false;
    }

    public void leaveSpot(Vehicle vehicle) {
        this.vehicle = null;
        available = true;
    }
}
