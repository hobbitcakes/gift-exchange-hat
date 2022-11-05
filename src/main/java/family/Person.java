package src.main.java.family;

import java.util.ArrayList;
import java.util.List;

public class Person implements Family{
    private String firstName;
    private String lastName;
    private Person spouse;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public Person(String firstName, String lastName, Person spouse) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.spouse = spouse;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean hasSpouse() {
        return this.spouse != null;
    }

    public Person getSpouse() {
        return spouse;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }

    @Override
    public String toString() {
        return firstName + ' ' + lastName;
    }

    @Override
    public List<Person> getPeople() {
        List<Person> people = new ArrayList<>();
        people.add(this);
        return people;
    }
}
