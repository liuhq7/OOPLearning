package ElevatorSystem;

import java.util.ArrayList;
import java.util.HashSet;

public class Elevator {
    private int elevatorID;
    private Status status;
    private int curFloor;
    private int maxWeight;
    private int tarFloor;

    private HashSet<Integer> upQueue = new HashSet<>();
    private HashSet<Integer> downQueue = new HashSet<>();

    public Elevator(int elevatorID) {
        this.elevatorID = elevatorID;
        this.status = Status.IDLE;
        this.curFloor = 1;
        this.maxWeight = 200;
    }

    public int getCurFloor() {
        return curFloor;
    }

    public int getStatus() {
        return status.ordinal();
    }

    public void moveUp() {
        status = Status.UP;
        curFloor += 1;
    }

    public void moveDown() {
        status = Status.DOWN;
        curFloor -= 1;
    }

    public void moveToFloor(int floor) {
        tarFloor = floor;
        while (curFloor < tarFloor) {
            moveUp();
        }
        while (curFloor > tarFloor) {
            moveDown();
        }
    }

    public void handleRequest(Request req) {
        if (req.direction == Direction.DOWN) {
            downQueue.add(req.tarFloor);
        }
        else {
            upQueue.add(req.tarFloor);
        }
    }

    public void processing() {

    }
}
