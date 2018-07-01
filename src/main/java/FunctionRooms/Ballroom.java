package FunctionRooms;

import Bedrooms.Room;

public class Ballroom extends Room {

    private String weddingGuest;

    public Ballroom(String roomName, String roomType, double roomRate, int roomCapacity) {
        super(roomName, roomType, roomRate, roomCapacity);{
            this.weddingGuest = weddingGuest;
        }
    }
}
