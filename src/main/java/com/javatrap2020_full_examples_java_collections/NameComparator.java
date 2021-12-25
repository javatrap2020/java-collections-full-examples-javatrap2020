package com.javatrap2020_full_examples_java_collections;

import java.util.Comparator;

public class NameComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Bird b1 = (Bird)o1;
        Bird b2 = (Bird)o2;
        return b1.getName().compareTo(b2.getName());
    }
}
