import family.Couple;
import family.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, world!");
        Couple caddie = new Couple(new Person("Cameron", "Peterson"), new Person("Maddie", "Peterson"));
        Couple eminate = new Couple(new Person("Nathan", "Peterson"), new Person("Emily", "Peterson"));
        Couple kerid = new Couple(new Person("Jared", "Peterson"), new Person("Keri", "Peterson"));
        Couple parents = new Couple(new Person("Brian", "Peterson"), new Person("Noella", "Peterson"));
        Person sarah = new Person("Sarah", "Peterson");

        List<Person> family = getPersonList(caddie, eminate, kerid, parents);
        family.add(sarah);

        List<Person> drawn = drawFromHat(family);
        
        for (Person p : drawn) {
            System.out.println(p);
        }
    }


    public static List<family.Member> getPeopleList(family.Member... f) {
        List<family.Member> fam = new ArrayList<>();

        return fam;
    }

    public static List<Person> drawFromHat(List<Person> people) {

        List<Person> possibleChoices = new ArrayList<>(people);
        List<Person> drawn = new ArrayList<>();
        for(Person p : people) {

            Person theyDrew = p.draw(possibleChoices);
            possibleChoices.remove(theyDrew);

            p.setTheyHave(theyDrew);
            drawn.add(p);
        }

        return drawn;
    }

    public static List<Person> getPersonList(Couple... c) {
        List<Person> people = new ArrayList<>();
        for (Couple couple : c) {
            people.add(couple.getHusband());
            people.add(couple.getWife());
        }

        return people;
    }
}
