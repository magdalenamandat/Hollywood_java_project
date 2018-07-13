package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="employees")
public abstract class Employee {
    private int id;
    private String firstName;
    private String lastName;


    public Employee() {
    }

    public Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
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

    @Column(name = "lastName")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "firstName")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }



}

