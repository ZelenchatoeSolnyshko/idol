package org.example.list;

public class QueueStrategy<T> implements ListStrategy<T> {

    @Override
    public MyNode<T> add(MyNode<T> head, MyNode<T> newMyNode) {
        if (head == null) {
            return newMyNode;
        }

        MyNode<T> tail = head;
        while (tail.getNext() != null) {
            tail = tail.getNext();
        }
        tail.setNext(newMyNode);

        return head;
    }

    @Override
    public MyNode<T> remove(MyNode<T> head) {
        // TODO: 03.10.2024 CODE HERE
        return null;
    }
}
