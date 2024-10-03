package org.example.list;

public class StackStrategy<T> implements ListStrategy<T> {

    @Override
    public MyNode<T> add(MyNode<T> head, MyNode<T> newMyNode) {
        newMyNode.setNext(head);
        return newMyNode;
    }

    @Override
    public MyNode<T> remove(MyNode<T> head) {
        // TODO: 03.10.2024 CODE HERE
        return null;
    }
}
