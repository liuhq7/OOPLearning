package ParkingLot;

import java.util.List;
import static ParkingLot.Constants.NUM_SPOT;

public class Level {
    private List<ParkingSpot> ParkingSpotList;
    private int availableSpotNumber;
    private boolean available;

    public Level(int availableSpotNumber) {
        this.availableSpotNumber = NUM_SPOT;
    }

    public int getAvailableSpotNumber() {
        return availableSpotNumber;
    }

    public void updateAvailableSpotNumber() {

    }
}
