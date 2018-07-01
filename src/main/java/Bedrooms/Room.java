package Bedrooms;

public abstract class Room {

    private String roomName;
    private String roomType;
    private double roomRate;
    private int roomCapacity;


    public Room(String roomName, String roomType, double roomRate, int roomCapacity) {
        this.roomName = roomName;
        this.roomType = roomType;
        this.roomRate = roomRate;
        this.roomCapacity = roomCapacity;
    }

//    public double getRoomRate() { return this.roomRate; }
//    public int getRoomCapacity() { return this.roomCapacity; }
//
//    public int increaseRoomCapacity(int roomCapacityIncrease) throws IllegalAccessException {
//        if (roomCapacityIncrease < 0) throw new IllegalAccessException("You can't increase capacity by less than 0");
//        return this.roomCapacity += roomCapacityIncrease;
//    };

    public String getRoomType() { return this.roomType; }

    public String getRoomName() { return this.roomName; }

    public double getRoomRate() { return this.roomRate; }

    public int getRoomCapacity() { return this.roomCapacity; }


}


