package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "films")
public class Film {

    private int id;
    private String title;
    private Director director;
    private Studio studio;
    private List<Actor> actors;

    public Film(){}

    public Film(String title, Director director, Studio studio){
        this.title = title;
        this.director = director;
        this.studio = studio;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @ManyToOne
    @JoinColumn(name="director_id", nullable=false)
    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }


    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public Studio getStudio() {
        return studio;
    }

    public void setStudio(Studio studio) {
        this.studio = studio;
    }
}
