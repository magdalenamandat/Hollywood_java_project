import models.Actor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ActorTest {

    Actor actor;


    @Before
    public void setUp() {
       actor = new Actor("Christian", "Bale");

    }

    @Test
    public void getFirstName(){
        assertEquals("Christian", actor.getFirstName());
    }

    @Test
    public void GetLastName(){
        assertEquals("Bale", actor.getLastName());
    }
}

