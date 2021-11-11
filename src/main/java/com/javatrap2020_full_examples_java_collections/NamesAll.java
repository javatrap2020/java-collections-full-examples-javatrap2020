package com.javatrap2020_full_examples_java_collections;

public class NamesAll {
    protected NamesEnum name;

    public NamesAll() {
    }

    public NamesAll(NamesEnum name) {
        this.name = name;
    }

    public void tellName() {
        switch (name) {
            case ITERABLE:
                System.out.print(" Iterable ");
                break;
            case COLLECTION:
                System.out.print(" Collection ");
                break;
            default:
                System.out.print("the end");
                break;
        }
    }
}
