package ParkingLot;

import java.security.Timestamp;

public class Ticket {
    private String id;
    private float amount;
    private Vehicle vehicle;
    private Timestamp enterTime;
    private Timestamp exitTime;

    public Ticket(String id, Vehicle vehicle, Timestamp enterTime) {
        this.id = id;
        this.vehicle = vehicle;
        this.enterTime = enterTime;
    }

    public float ParkingFee(Vehicle vehicle, Timestamp enterTime, Timestamp exitTime) {
        return 0;
    }
}
