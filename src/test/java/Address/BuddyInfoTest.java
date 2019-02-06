package Address;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuddyInfoTest {
    @Test
    public void testAddress() {
        BuddyInfo buddyInfo = new BuddyInfo("Taz", "Address1");
        assertEquals(buddyInfo.getAddress(), "Address1");
    }
}
