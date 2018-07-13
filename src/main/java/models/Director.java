package models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "directors")
public class Director extends Employee {

    private List<Film> films;

    public Director() {
    }

    public Director(String firstName, String lastName) {
        super(firstName, lastName);
        this.films = new ArrayList<Film>();
    }

    @OneToMany(mappedBy="director", fetch = FetchType.LAZY)
    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

    public void addFilm(Film film){
        this.films.add(film);
    }
}
