import Bedrooms.BedroomTwo;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class BedroomTwoTest {

    BedroomTwo bedroomTwo;

    @Before
    public void before() {
        bedroomTwo = new BedroomTwo("Bedroom Two", "Single", 59.99, 1);
    }
}
