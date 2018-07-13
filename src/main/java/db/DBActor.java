package db;

import models.Actor;
import models.Film;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;
import org.hibernate.Session;

import java.util.List;

public class DBActor {

    private static Session session;

    public static List<Film> getFilmsFromActor(Actor actor){
        List<Film> results = null;
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            Criteria cr = session.createCriteria(Film.class);
            cr.createAlias("actors", "actor");
            cr.add(Restrictions.eq("actor.id", actor.getId()));
            results = cr.list();
        } catch (HibernateException e){
            e.printStackTrace();
        }finally {

            session.close();
        }
        return results;
    }
}
