package db;

import models.Actor;
import models.Film;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBFilm {

    private static Session session;
    private static Transaction transaction;

    public static List<Actor> getActorsFromFilm(Film film){
        List<Actor> results = null;
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            Criteria cr = session.createCriteria(Actor.class);
            //TODO: Alias Magic
            cr.createAlias("films", "film");
            cr.add(Restrictions.eq("film.id", film.getId()));
            results = cr.list();
        } catch (HibernateException e){
            e.printStackTrace();
        }finally {

            session.close();
        }
        return results;
    }
}
