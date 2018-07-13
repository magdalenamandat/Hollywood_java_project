import models.Actor;
import models.Director;
import models.Film;
import models.Studio;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FilmTest {

    Film film;
    Director director;
    Studio studio;


    @Before
    public void setUp() {
        director = new Director("Christopher", "Nolan");
        studio = new Studio("Warner Bros");
        film = new Film("Batman begins", director, studio);

    }

    @Test
    public void getTitle(){
        assertEquals("Batman begins", film.getTitle());
    }

    @Test
    public void GetDirector(){
        assertEquals(director, film.getDirector());
    }

    @Test
    public void GetStudio(){
        assertEquals(studio, film.getStudio());
    }
}
