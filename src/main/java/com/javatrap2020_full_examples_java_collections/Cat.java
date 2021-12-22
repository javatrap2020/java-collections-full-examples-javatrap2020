package com.javatrap2020_full_examples_java_collections;

class Cat implements Comparable<Cat>{

    int age;
    private String name;

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Cat o) {
        if (age == o.age) {
            return 0;
        } else if (age > o.age) {
            return 1;
        } else {
            return -1;
        }

    }
}
