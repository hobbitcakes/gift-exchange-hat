package family;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Person implements Member {
    private String firstName;
    private String lastName;
    private Person spouse;
    private Person theyHave;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public Person(String firstName, String lastName, Person spouse) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.spouse = spouse;
    }

    public Person getTheyHave() {
        return theyHave;
    }

    public void setTheyHave(Person theyHave) {
        this.theyHave = theyHave;
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
        return firstName + ' ' + lastName + " has " + getTheyHave().getFirstName() + ' ' + getTheyHave().getLastName();
    }


    @Override
    public List<Person> getPeople() {
        return null;
    }

    public Person draw(List<Person> people) {

        Random rand = new Random();
        Person pick = people.get(rand.nextInt(people.size()));

        if(pick.equals(this.spouse) || pick.equals(this)) {
            pick = draw(people);
        }

        return pick;

    }
}
