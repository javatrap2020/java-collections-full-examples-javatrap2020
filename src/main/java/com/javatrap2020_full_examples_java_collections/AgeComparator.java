package com.javatrap2020_full_examples_java_collections;

import java.util.Comparator;

public class AgeComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Bird b1 = (Bird)o1;
        Bird b2 = (Bird)o2;

        if (b1.getAge() == b2.getAge()) {
            return 0;
        } else if (b1.getAge() > b2.getAge()) {
            return 1;
        } else {
            return -1;
        }
    }
}
