import Bedrooms.BedroomOne;
import Bedrooms.BedroomThree;
import Bedrooms.BedroomTwo;
import FunctionRooms.Ballroom;
import FunctionRooms.ConferenceRoom;
import FunctionRooms.DiningRoom;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;


public class HotelTest {

    Hotel hotel;
    BedroomOne bedroomOne;
    BedroomTwo bedroomTwo;
    BedroomThree bedroomThree;
    Ballroom ballroom;
    ConferenceRoom conferenceRoom;
    DiningRoom diningRoom;
    Guest guest;


    @Before
    public void before() {
        hotel = new Hotel("Hotel California");
        bedroomOne = new BedroomOne("Bedroom One", "Double", 79.99, 2);
        bedroomTwo = new BedroomTwo("Bedroom Two", "Single", 59.99, 1);
        bedroomThree = new BedroomThree("Bedroom Three", "Double", 79.99, 2);
        ballroom = new Ballroom("Ballroom", "Function", 750.00, 200);
        conferenceRoom = new ConferenceRoom("Conference", "Function", 150.00, 25);
        diningRoom = new DiningRoom("Dining Bedrooms.Room", "Function", 0.00, 100);
        guest = new Guest("Mr James Hendrix", 900.00);
        guest = new Guest("Ms Janis Joplin", 1000.00);
        guest = new Guest("Mr Eric Clapton", 550.00);
        guest = new Guest("Mr Michael Jagger", 500.00);
        guest = new Guest("Mr Robert Dylan", 300.00);
    }

    @Test
    public void hotelHasName(){
        assertEquals("Hotel California", hotel.getHotelName());
    }



}
