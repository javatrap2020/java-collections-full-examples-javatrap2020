package com.javatrap2020_full_examples_java_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Persons implements Iterable<Person> {

    private List<Person> persons ;
    private static final int MIN_AGE = 10;

    public Persons() {
        this.persons = new ArrayList<>(MIN_AGE);
    }

    public Persons(int age) {
        this.persons = new ArrayList<>(age);
    }

    public void addPerson(Person person) {
        this.persons.add(person);
    }

    public void removePerson(Person person) {
        this.persons.remove(person);
    }

    public int age() {
        return this.persons.size();
    }

    @Override
    public Iterator<Person> iterator() {
        return this.persons.iterator();
    }
}
