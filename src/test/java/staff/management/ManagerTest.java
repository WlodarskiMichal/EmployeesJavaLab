package staff.management;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void setUp(){
        manager = new Manager("Luke","SD123123", 20000, "Events");
    }
    @Test
    public void canGetName(){
        assertEquals("Luke", manager.getName());
    }
    @Test
    public void canGetNiNumber(){
        assertEquals("SD123123", manager.getNiNumber());
    }
    @Test
    public void canGetSalary(){
        assertEquals(20000, manager.getSalary(), 0.1);
    }
    @Test
    public void canGetDeptName(){
        assertEquals("Events", manager.getDeptName());
    }
    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(10000.5);
        assertEquals(30000.5, manager.getSalary(), 0.01);
    }
    @Test
    public void canPayBonus(){
        assertEquals(200, manager.payBonus(), 0.1);
    }
    @Test
    public void cannotRaiseNegative(){
        manager.raiseSalary(-1000);
        assertEquals(20000, manager.getSalary(), 0.1);
    }
    @Test
    public void canChangeName(){
        manager.setName("Michael");
        assertEquals("Michael", manager.getName());
    }
    @Test
    public void cannotChangeNameToNull(){
        manager.setName(null);//it's not gonna assign because method is not allowing it
        //so the name is gonna stay on the one set up Before so "Luke"
        assertEquals("Luke", manager.getName());
    }

}

