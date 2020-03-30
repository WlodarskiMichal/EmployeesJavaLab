package staff.techStaff;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer;

    @Before
    public void setUp(){
        developer = new Developer("John", "SD123", 50000);
    }
    @Test
    public void canGetName(){
        assertEquals("John", developer.getName());
    }
}
