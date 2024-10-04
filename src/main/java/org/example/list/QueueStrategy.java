package org.example.list;

public class QueueStrategy<T> implements ListStrategy<T> {

    @Override
    public MyNode<T> add(MyNode<T> head, MyNode<T> newMyNode) {
        MyNode<T> iter = head;
        while (iter.getNext() != null) {
            iter = iter.getNext();
        }
        iter.setValue(null);
        return head;
    }

    @Override
    public MyNode<T> remove(MyNode<T> head) {
        MyNode<T> o = head;
        head = o.getNext();
        o.setNext(null);
        o.setValue(null);
        return head;
    }
}
