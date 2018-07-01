import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before(){
        guest = new Guest("Mr James Hendrix", 900.00);
    }

    @Test
    public void guestHasName(){
        assertEquals("Mr James Hendrix", guest.getGuestName());
    }

    @Test
    public void guestWalletContents(){
        assertEquals(900.00, guest.getGuestWallet());
    }

}
