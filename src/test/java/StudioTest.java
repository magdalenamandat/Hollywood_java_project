import models.Director;
import models.Film;
import models.Studio;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudioTest {

    Studio studio;



    @Before
    public void setUp() {
        studio = new Studio("Warner Bros");

    }

    @Test
    public void getName(){
        assertEquals("Warner Bros", studio.getName());
    }
}
