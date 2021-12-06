package com.javatrap2020_full_examples_java_collections;

public class LinkedStack<E> implements StackInterface<E> {

    private SinglyLinkedList<E> data = new SinglyLinkedList<>();

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public void push(E e) {
        data.addFirst(e);
        System.out.println(toString());
    }

    @Override
    public E top() {
        return data.first();
    }

    @Override
    public E pop() {
        return data.removeFirst();
    }

    @Override
    public String toString() {
        return "LinkedStack{" +
                "data=" + data +
                '}';
    }
}
