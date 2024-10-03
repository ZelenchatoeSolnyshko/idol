package org.example.list;

public interface ListStrategy<T> {
    MyNode<T> add(MyNode<T> head, MyNode<T> newMyNode);

    MyNode<T> remove(MyNode<T> head);
}
