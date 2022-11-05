package src.main.java.family;

import java.util.ArrayList;
import java.util.List;

public class Couple implements Family {
    private Person husband;
    private Person wife;

    public Couple(Person husband, Person wife) {
        this.husband = husband;
        this.wife = wife;

        this.husband.setSpouse(this.wife);
        this.wife.setSpouse(this.husband);
    }

    public Person getHusband() {
        return husband;
    }

    public Person getWife() {
        return wife;
    }

    @Override
    public List<Person> getPeople() {
        List<Person> people = new ArrayList<>();
        people.add(this.husband);
        people.add(this.wife);

        return people;
    }
}
