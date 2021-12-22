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
                System.out.print("\n" + Color.CYAN_BACKGROUND + "Iterable" + Color.RESET + " ");
                break;
            case COLLECTION:
                System.out.print("\n" + Color.CYAN_BACKGROUND + "Collection" + Color.RESET + " ");
                break;
            case COLLECTION_SET:
                System.out.print("\n" + Color.CYAN_BACKGROUND + "Collection Set" + Color.RESET + " ");
                break;
            case COLLECTION_SET_HASH_SET:
                System.out.print("\n" + Color.CYAN_BACKGROUND + "Collection Set HashSet" + Color.RESET + " ");
                break;
            case COLLECTION_SET_LINKED_HASH_SET:
                System.out.print("\n" + Color.CYAN_BACKGROUND + "Collection Set LinkedHashSet" + Color.RESET + " ");
                break;
            case COLLECTION_SET_TREE_SET:
                System.out.print("\n" + Color.CYAN_BACKGROUND + "Collection Set TreeSet" + Color.RESET + " ");
                break;
            case COLLECTION_LIST:
                System.out.print("\n" + Color.CYAN_BACKGROUND + "Collection List" + Color.RESET + " ");
                break;
            case COLLECTION_LIST_ARRAY_LIST:
                System.out.print("\n" + Color.CYAN_BACKGROUND + "Collection List ArrayList" + Color.RESET + " ");
                break;
            case COLLECTION_LIST_LINKED_LIST:
                System.out.print("\n" + Color.CYAN_BACKGROUND + "Collection List LinkedList" + Color.RESET + " ");
                break;
            case COLLECTION_LIST_VECTOR:
                System.out.print("\n" + Color.CYAN_BACKGROUND + "Collection List Vector" + Color.RESET + " ");
                break;
            case COLLECTION_LIST_VECTOR_STACK:
                System.out.print("\n" + Color.CYAN_BACKGROUND + "Collection List Vector Stack" + Color.RESET + " ");
                break;
            case COLLECTION_QUEUE_PRIORITY_QUEUE:
                System.out.print("\n" + Color.CYAN_BACKGROUND + "Collection Queue PriorityQueue" + Color.RESET + " ");
                break;
            case COLLECTION_DEQUE_ARRAY_DEQUE:
                System.out.print("\n" + Color.CYAN_BACKGROUND + "Collection Deque ArrayDeque" + Color.RESET + " ");
                break;
            case MAP_HASH_MAP:
                System.out.print("\n" + Color.CYAN_BACKGROUND + "Map HashMap" + Color.RESET + " ");
                break;
            case MAP_HASH_MAP_LINKED_HASH_MAP:
                System.out.print("\n" + Color.CYAN_BACKGROUND + "Map HashMap LinkedHashMap" + Color.RESET + " ");
                break;
            case MAP_SORTED_MAP_NAVIGABLE_MAP_TREE_MAP:
                System.out.print("\n" + Color.CYAN_BACKGROUND + "Map SortedMap NavigableMap TreeMap" + Color.RESET + " ");
                break;
            case COLLECTIONS:
                System.out.print("\n" + Color.CYAN_BACKGROUND + "Collections" + Color.RESET + " ");
                break;
            case ARRAYS:
                System.out.print("\n" + Color.CYAN_BACKGROUND + "Arrays" + Color.RESET + " ");
                break;
            case COMPARABLE:
                System.out.print("\n" + Color.CYAN_BACKGROUND + "Comparable" + Color.RESET + " ");
                break;
            case COMPARATOR:
                System.out.print("\n" + Color.CYAN_BACKGROUND + "Comparator" + Color.RESET + " ");
                break;
            default:
                System.out.print("\n" + Color.CYAN_BACKGROUND + "the end" + Color.RESET + " ");
                break;
        }
    }
}
