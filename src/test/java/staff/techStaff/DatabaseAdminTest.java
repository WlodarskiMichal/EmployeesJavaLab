package staff.techStaff;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin databaseAdmin;

    @Before
    public void setUp(){
        databaseAdmin = new DatabaseAdmin("John", "SD12", 10000);
    }
    @Test
    public void canGetSalary(){
        assertEquals(10000, databaseAdmin.getSalary(), 0.1);
    }

}
