package ParkingLot;

public class HandicappedParkingSpot extends ParkingSpot {
    public HandicappedParkingSpot(ParkingSpotType type, String spotNo, Level level) {
        super(ParkingSpotType.HANDICAPPED);
        this.spotNo = spotNo;
        this.level = level;
    }

}
