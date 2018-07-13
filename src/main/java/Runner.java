import db.DBHelper;
import models.Actor;
import models.Director;
import models.Film;
import models.Studio;

public class Runner {

    public static void main(String[] args) {

        Studio studio1 = new Studio("Warner Bros");
        DBHelper.save(studio1);

        Director director1 = new Director("Chrirtopher", "Nolan");
        DBHelper.save(director1);


        Film film1 = new Film("Batman begins", director1, studio1);
        DBHelper.save(film1);

        Film film2 = new Film("The Dark Knight", director1, studio1);
        DBHelper.save(film2);




        Actor actor1 = new Actor("Christian", "Nolan");
        DBHelper.save(actor1);
    }
}
