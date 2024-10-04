package org.example.list;

public class StackStrategy<T> implements ListStrategy<T> {

    @Override
    public MyNode<T> add(MyNode<T> head, MyNode<T> newMyNode) {
        MyNode<T> iter = head;
        if (head == null) {
            head = newMyNode;
        }
        else {
            newMyNode.setNext(head);
            head = newMyNode;
        }
        return head;
    }

    @Override
    public MyNode<T> remove(MyNode<T> head) {
        MyNode<T> iter = head;
        while (iter.getNext() != null) {
            iter = iter.getNext();
        }
        iter.setValue(null);
        return head;
    }
}
