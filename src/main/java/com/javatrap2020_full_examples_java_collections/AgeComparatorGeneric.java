package com.javatrap2020_full_examples_java_collections;

import java.util.Comparator;

public class AgeComparatorGeneric implements Comparator<Bird> {

    @Override
    public int compare(Bird o1, Bird o2) {
        if (o1.getAge() == o2.getAge()) {
            return 0;
        } else if (o1.getAge() > o2.getAge()) {
            return 1;
        } else {
            return -1;
        }

    }
}
