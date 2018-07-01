import FunctionRooms.ConferenceRoom;
import org.junit.Before;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom("Conference", "Function", 150.00, 25);
    }
}

