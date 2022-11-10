package family;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Couple implements Member {
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

    @Override
    public Person draw(List<Person> people) {
        Random rand = new Random();
        Person pick = people.get(rand.nextInt(people.size()));
        return pick;

    }
}
