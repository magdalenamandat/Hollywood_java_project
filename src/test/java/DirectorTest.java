import models.Actor;
import models.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;


    @Before
    public void setUp() {
        director = new Director("Christopher", "Nolan");
    }

    @Test
    public void getFirstName(){
        assertEquals("Christopher", director.getFirstName());
    }

    @Test
    public void GetLastName(){
        assertEquals("Nolan", director.getLastName());
    }
}
