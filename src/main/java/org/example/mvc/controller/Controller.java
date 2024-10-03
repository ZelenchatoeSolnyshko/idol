package org.example.mvc.controller;

import org.example.list.ListStrategy;
import org.example.mvc.model.MyListModel;
import org.example.mvc.view.MyFrame;
import org.example.mvc.view.MyPanel;

import javax.swing.*;

public class Controller {
    private MyListModel listModel;
    private MyFrame myFrame;
    private MyPanel myPanel;
    private JTextArea outputView;

    public Controller() {

        outputView = new JTextArea();
        outputView.setEditable(false);
        outputView.setLineWrap(true);
        myPanel = new MyPanel(this);
        myFrame = new MyFrame(myPanel, this);
        // TODO: 03.10.2024 CODE HERE
        // TODO: 03.10.2024 Связать наблюдателей, добавить недостающее в конструктор
        //listModel.addObserver(myPanel);
    }

    public void addAction(String value) {
        // TODO: 03.10.2024 CODE HERE
    }

    public JTextArea getOutputView() {
        return outputView;
    }

    public void updateList() {
        // TODO: 03.10.2024 CODE HERE
    }

    public void changeStrategy(ListStrategy<Integer> strategy) {
        listModel.changeStrategy(strategy);
    }
}
