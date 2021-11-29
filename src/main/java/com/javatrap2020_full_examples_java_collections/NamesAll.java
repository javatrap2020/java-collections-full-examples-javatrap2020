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
            case COLLECTION_SET:
                System.out.print(" Collection Set ");
                break;
            case COLLECTION_SET_HASH_SET:
                System.out.print(" Collection HashSet ");
                break;
            case COLLECTION_SET_LINKED_HASH_SET:
                System.out.print(" Collection LinkedHashSet ");
                break;
            case COLLECTION_SET_TREE_SET:
                System.out.print(" Collection TreeSet ");
                break;
            default:
                System.out.print("the end");
                break;
        }
    }
}
