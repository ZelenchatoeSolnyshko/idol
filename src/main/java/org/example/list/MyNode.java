package org.example.list;

class MyNode<T> {
    private T value;
    private MyNode<T> next;

    public MyNode() {

    }
    public MyNode(T value) {
        this.value = value;
    }

    public MyNode<T> getNext() {
        return next;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setNext(MyNode<T> next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }
}
