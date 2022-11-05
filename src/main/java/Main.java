package src.main.java;

import src.main.java.family.Couple;
import src.main.java.family.Family;
import src.main.java.family.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {

public static void main(String[] args) {
    System.out.println("Hello, world!");
    Couple caddie = new Couple(new Person("Cameron", "Peterson"), new Person("Maddie", "Peterson"));
    Couple eminate = new Couple(new Person("Nathan", "Peterson"), new Person("Emily", "Peterson"));
    Couple kerid = new Couple(new Person("Jared", "Peterson"), new Person("Keri", "Peterosn"));
    Couple parents = new Couple(new Person("Brian", "Peterson"), new Person("Noella", "Peterson"));
    Person sarah = new Person("Sarah", "Peterson");
    List<Person> family = getPersonList(caddie, eminate, kerid, parents);
    family.add(sarah);

    System.out.println(family);



}
public static List<Family> getPeopleList(Family ... f) {
    List<Family> fam = new ArrayList<>();



    return fam;
}

public static List<Person> getPersonList(Couple ... c) {
    List<Person> people = new ArrayList<>();
    for(Couple couple : c) {
        people.add(couple.getHusband());
        people.add(couple.getWife());
    }

    return people;
}
}
