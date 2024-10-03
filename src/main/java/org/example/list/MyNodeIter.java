package org.example.list;

import java.util.Iterator;
import java.util.function.Consumer;

public class MyNodeIter<T> extends MyNode<T> implements Iterator<T> {
    private static final MyNode<?> EMPTY_NODE = new MyNode<>();

    public MyNodeIter(MyNode<T> node) {
        super();
        setNext(node.getNext());
        setValue(node.getValue());
    }

    @Override
    public boolean hasNext() {
        return getNext() != EMPTY_NODE;
    }

    @Override
    public T next() {
        T value = getValue();
        MyNode<T> tmp = this.getNext();
        if (tmp != null) {
            setNext(tmp.getNext());
            setValue(tmp.getValue());
        } else {
            setNext((MyNode<T>) EMPTY_NODE);
            setValue(null);
        }
        return value;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }

    @Override
    public void forEachRemaining(Consumer<? super T> action) {
        Iterator.super.forEachRemaining(action);
    }
}
