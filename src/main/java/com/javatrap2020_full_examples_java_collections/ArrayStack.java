package com.javatrap2020_full_examples_java_collections;

import java.util.Arrays;

@SuppressWarnings("unchecked")
public class ArrayStack<E> implements StackInterface<E> {

    public static final int CAPACITY = 1000;
    private  E[] data;
    private  int top = 11;

    public ArrayStack() {
        this(CAPACITY);
    }

    public ArrayStack(int capacity) {
        data = (E[]) new Object[capacity];
    }


    @Override
    public int size() {
        return (top + 1);

    }

    @Override
    public boolean isEmpty() {
        return (top == -1);
    }

    @Override
    public void push(Object e) {
        if ( size() == data.length) {
            throw new IllegalStateException("Stack is full");
        } data[++top] = (E) e;
        System.out.println(toString());

    }

    @Override
    public String toString() {
        return Color.CYAN_BACKGROUND + "ArrayStack" + Color.RESET + "{"  +
                "data=" + Arrays.toString(data) +
                ", top=" + top +
                '}';
    }

    @Override
    public E top() {
        if (isEmpty()) {
            return null;
        }
        return data[top];
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            return null;
        } E answer = data[top];
        data[top] = null;
        top--;
        return answer;
    }
}
