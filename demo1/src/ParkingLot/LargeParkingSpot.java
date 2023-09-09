package ParkingLot;

public class LargeParkingSpot extends ParkingSpot {
    public LargeParkingSpot(ParkingSpotType type, String spotNo, Level level) {
        super(ParkingSpotType.LARGE);
        this.spotNo = spotNo;
        this.level = level;
    }
}
