import Bedrooms.BedroomOne;
import Bedrooms.BedroomThree;
import Bedrooms.BedroomTwo;
import Bedrooms.Hotel;
import FunctionRooms.Ballroom;
import FunctionRooms.ConferenceRoom;
import FunctionRooms.DiningRoom;
import org.junit.Before;
import org.junit.Test;

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
    }

    @Test
    public void getHotelName(){
        assertEquals("Hotel California", hotel.getHotelName());
    }


    @Test
    public void hotelFull(){
        assertEquals(0, hotel.hotelFull());
    }

    @Test
    public void noFunctionRooms(){
        assertEquals(0, hotel.noFunctionRooms());
    }

}
