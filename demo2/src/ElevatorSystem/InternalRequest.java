package ElevatorSystem;

import java.util.ArrayList;

public class InternalRequest extends Request{

    public InternalRequest(int floor, Direction direction) {
        this.tarFloor = floor;
        this.direction = direction;
    }
}
