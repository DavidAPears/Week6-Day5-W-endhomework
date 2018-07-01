import Bedrooms.BedroomThree;
import org.junit.Before;

public class BedroomThreeTest {

    BedroomThree bedroomThree;

    @Before
    public void before() {
        bedroomThree = new BedroomThree("Bedroom Three", "Double", 79.99, 2);
    }
}
