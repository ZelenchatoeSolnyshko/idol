package org.example.mvc.view;

import org.example.mvc.controller.Controller;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

public class MyPanel extends JPanel implements Observer {
    private Controller controller;

    public MyPanel(Controller controller) {
        // TODO: 03.10.2024 CODE HERE
        JPanel panel = new JPanel();
        panel.add(controller.getOutputView());
        add(panel);
    }

    @Override
    public void update(Observable o, Object arg) {
        repaint();
        controller.updateList();
    }
}
