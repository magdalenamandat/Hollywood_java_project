package models;

import java.util.List;

public class Actor extends Employee {

    private List<Film> films;

    public Actor() {
    }

    public Actor(String firstName, String lastName) {
        super(firstName, lastName);
        this.films = films;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }
}
