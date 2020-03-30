package staff.management;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    private Director director;

    @Before
    public void setUp(){
        director = new Director("Melinda", "SD123", 1000000, "Management", 10000);
    }
    @Test
    public void canGetBudget(){
        assertEquals(10000, director.getBudget(), 0.1);
    }
    @Test
    public void canGetUpdatedDirectorPayBonus(){
        assertEquals(20000, director.payBonus(), 0.1);
    }
}
