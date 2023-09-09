package ParkingLot;

public class SmallParkingSpot extends ParkingSpot {
    public SmallParkingSpot(ParkingSpotType type, String spotNo, Level level) {
        super(ParkingSpotType.SMALL);
        this.spotNo = spotNo;
        this.level = level;
    }
}
