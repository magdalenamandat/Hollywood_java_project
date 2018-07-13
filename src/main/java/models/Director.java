package models;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

public class Director extends Employee {

    private List<Film> films;

    public Director() {
    }

    public Director(String firstName, String lastName) {
        super(firstName, lastName);
        this.films = films;
    }

    @OneToMany(mappedBy="director", fetch = FetchType.LAZY)
    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }
}
