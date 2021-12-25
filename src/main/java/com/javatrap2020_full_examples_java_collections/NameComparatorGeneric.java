package com.javatrap2020_full_examples_java_collections;

import java.util.Comparator;

public class NameComparatorGeneric implements Comparator<Bird> {
    @Override
    public int compare(Bird o1, Bird o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
