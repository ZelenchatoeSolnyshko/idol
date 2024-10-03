package org.example.list;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MySimpleList<T> implements Iterable<T>{
    protected MyNode<T> head;
    protected int length;

    private ListStrategy<T> listStrategy;

    public MySimpleList(ListStrategy<T> strategy) {
        listStrategy = strategy;
    }

    public int getLength() {
        return length;
    }

    public void add(T element) {
        MyNode<T> newMyNode = new MyNode<>(element);

        head = (head == null)
                ? newMyNode
                : listStrategy.add(head, newMyNode);
        length++;
    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public Iterator<T> iterator() {
        return new MyNodeIter<>(head);
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return Iterable.super.spliterator();
    }

    public void setListStrategy(ListStrategy<T> listStrategy) {
        this.listStrategy = listStrategy;
    }

    public void remove() {
        // TODO: 03.10.2024 CODE HERE
    }
}
