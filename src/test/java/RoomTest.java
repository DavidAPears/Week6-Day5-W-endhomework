
import Bedrooms.BedroomOne;
import Bedrooms.BedroomThree;
import Bedrooms.BedroomTwo;
import Bedrooms.Room;
import FunctionRooms.Ballroom;
import FunctionRooms.ConferenceRoom;
import FunctionRooms.DiningRoom;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {
    Room room;

//   ------------ Tests for Bedroom ONE ---------------
    @Test
    public void bedroomOneHasRoomName() {
        room = new BedroomOne("Bedroom One", "Double", 79.99, 2);
        assertEquals("Bedroom One", room.getRoomName());
    }

    @Test
    public void bedroomOneHasRoomType() {
        room = new BedroomOne("Bedroom One", "Double", 79.99, 2);
        assertEquals("Double", room.getRoomType());
    }

    @Test
    public void bedroomOneHasRoomRate(){
        room = new BedroomOne("Bedroom One", "Double", 79.99, 2);
        assertEquals(79.99, room.getRoomRate(), 0.01 );
    }

    @Test
    public void bedroomOneHasRoomCapacity(){
        room = new BedroomOne("Bedroom One", "Double", 79.99, 2);
        assertEquals(2, room.getRoomCapacity());
    }

    //   ------------ Tests for Bedroom TWO ---------------

    @Test
    public void bedroomTwoHasRoomName() {
        room = new BedroomTwo("Bedroom Two", "Single", 59.99, 1);
        assertEquals("Bedroom Two", room.getRoomName());
    }

    @Test
    public void bedroomTwoHasRoomType() {
        room = new BedroomTwo("Bedroom Two", "Single", 59.99, 1);
        assertEquals("Single", room.getRoomType());
    }

    @Test
    public void bedroomTwoHasRoomRate(){
        room = new BedroomTwo("Bedroom Two", "Single", 59.99, 1);
        assertEquals(59.99, room.getRoomRate(), 0.01 );
    }

    @Test
    public void bedroomTwoHasRoomCapacity(){
        room = new BedroomTwo("Bedroom Two", "Single", 59.99, 1);
        assertEquals(1, room.getRoomCapacity());
    }

    //   ------------ Tests for Bedroom THREE ---------------

    @Test
    public void bedroomThreeHasRoomName() {
        room = new BedroomThree("Bedroom Three", "Double", 79.99, 2);
        assertEquals("Bedroom Three", room.getRoomName());
    }

    @Test
    public void bedroomThreeHasRoomType() {
        room = new BedroomThree("Bedroom Three", "Double", 79.99, 2);
        assertEquals("Double", room.getRoomType());
    }

    @Test
    public void bedroomThreeHasRoomRate() {
        room = new BedroomThree("Bedroom Three", "Double", 79.99, 2);
        assertEquals(79.99, room.getRoomRate(), 0.01);
    }

    @Test
    public void bedroomThreeHasRoomCapacity() {
        room = new BedroomThree("Bedroom Three", "Double", 79.99, 2);
        assertEquals(2, room.getRoomCapacity());
    }

    //   ------------ Tests for BALLROOM  ---------------

    @Test
    public void ballroomHasRoomName() {
        room = new Ballroom("Bedrooms.FunctionRooms.FunctionRooms.Ballroom", "Function", 750.00, 200);
        assertEquals("Bedrooms.FunctionRooms.FunctionRooms.Ballroom", room.getRoomName());
    }

    @Test
    public void ballroomHasRoomType() {
        room = new Ballroom("Bedrooms.FunctionRooms.FunctionRooms.Ballroom", "Function", 750.00, 200);
        assertEquals("Function", room.getRoomType());
    }

    @Test
    public void ballroomHasRoomRate() {
        room = new Ballroom("Bedrooms.FunctionRooms.FunctionRooms.Ballroom", "Function", 750.00, 200);
        assertEquals(750, room.getRoomRate(), 0.01);
    }

    @Test
    public void ballroomHasRoomCapacity() {
        room = new Ballroom("Bedrooms.FunctionRooms.FunctionRooms.Ballroom", "Function", 750.00, 200);
        assertEquals(200, room.getRoomCapacity());
    }

    //   ------------ Tests for DINING ROOM ---------------

    @Test
    public void diningRoomHasRoomName() {
        room = new DiningRoom("Dining Bedrooms.Room", "Function", 0.00, 100);
        assertEquals("Dining Bedrooms.Room", room.getRoomName());
    }

    @Test
    public void diningRoomHasRoomType() {
        room = new DiningRoom("Dining Bedrooms.Room", "Function", 0.00, 100);
        assertEquals("Function", room.getRoomType());
    }

    @Test
    public void diningRoomHasRoomRate() {
        room = new DiningRoom("Dining Bedrooms.Room", "Function", 0.00, 100);
        assertEquals(0.00, room.getRoomRate(), 0.01);
    }

    @Test
    public void diningRoomHasRoomCapacity() {
        room = new DiningRoom("Dining Bedrooms.Room", "Function", 0.00, 100);
        assertEquals(100, room.getRoomCapacity());
    }

    //   ------------ Tests for CONFERENCE ROOM ---------------

    @Test
    public void conferenceRoomHasRoomName() {
        room = new ConferenceRoom("Conference Bedrooms.Room", "Function", 150.00, 20 );
        assertEquals("Conference Bedrooms.Room", room.getRoomName());
    }

    @Test
    public void conferenceRoomHasRoomType() {
        room = new ConferenceRoom("Conference Bedrooms.Room", "Function", 150.00, 20 );
        assertEquals("Function", room.getRoomType());
    }

    @Test
    public void conferenceRoomHasRoomRate() {
        room = new ConferenceRoom("Conference Bedrooms.Room", "Function", 150.00, 20 );
        assertEquals(150.00, room.getRoomRate(), 0.01);
    }

    @Test
    public void conferenceRoomHasRoomCapacity() {
        room = new ConferenceRoom("Conference Bedrooms.Room", "Function", 150.00, 20 );
        assertEquals(20, room.getRoomCapacity());
    }

}










