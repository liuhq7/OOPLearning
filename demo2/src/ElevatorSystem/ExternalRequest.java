package ElevatorSystem;

import java.util.ArrayList;

public class ExternalRequest extends Request{

    public ExternalRequest(int floor, Direction direction) {
        this.tarFloor = floor;
        this.direction = direction;
    }
}
