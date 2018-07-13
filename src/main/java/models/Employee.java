package models;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }



}

