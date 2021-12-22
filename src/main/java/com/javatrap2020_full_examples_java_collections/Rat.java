package com.javatrap2020_full_examples_java_collections;

class Rat implements Comparable<Rat> {
    private int age;
    private String name;


    public Rat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Rat o) {
        if (age == o.age) {
            return 0;
        } else if (age < o.age) {
            return 1;
        } else {
            return -1;
        }
    }
}
