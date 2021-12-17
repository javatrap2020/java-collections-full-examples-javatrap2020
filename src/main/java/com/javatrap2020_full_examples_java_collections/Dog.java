package com.javatrap2020_full_examples_java_collections;

import java.util.Comparator;

class Dog {
    private int age;
    String name, sex;

    public Dog(int age, String name, String sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    static class SortAge implements Comparator<Dog> {
        public int compare(Dog a, Dog b) {
            return a.age - b.age;
        }
    }
}
