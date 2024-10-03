package org.example.mvc.model;

import org.example.list.ListStrategy;
import org.example.list.MySimpleList;

import java.util.Observable;

public class MyListModel extends Observable {
    private MySimpleList<Integer> list;

    public MyListModel() {
        // TODO: 03.10.2024 CODE HERE
    }

    public void addAction(Integer element) {
        // TODO: 03.10.2024 CODE HERE
    }

    public void removeAction() {
        // TODO: 03.10.2024 CODE HERE
    }

    public void changeStrategy(ListStrategy strategy) {
        // TODO: 03.10.2024 CODE HERE
    }

    public String stringList() {
        // TODO: 03.10.2024 CODE HERE
        return null;
    }
}
