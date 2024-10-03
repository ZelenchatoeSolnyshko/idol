package org.example.mvc.view;

import org.example.mvc.controller.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    private MyPanel panel;
    private Controller controller;

    public MyFrame(MyPanel panel, Controller controller) {
        super();
        this.panel = panel;
        this.controller = controller;
        init();
        setLayout(new GridLayout(2, 0));
    }

    public void init() {
        JButton buttonAdd = new JButton("Добавить");
        JButton buttonRemove = new JButton("Удалить");

        panel.add(buttonAdd);
        panel.add(buttonRemove);

        JRadioButton jRadioButtonStack = new JRadioButton("Stack");
        jRadioButtonStack.setSelected(true);
        JRadioButton jRadioButtonQueue = new JRadioButton("Queue");
        ButtonGroup group = new ButtonGroup();
        jRadioButtonQueue.setSelected(false);
        group.add(jRadioButtonQueue);
        group.add(jRadioButtonStack);


        jRadioButtonQueue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO: 03.10.2024 CODE HERE
            }
        });
        jRadioButtonStack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO: 03.10.2024 CODE HERE
            }
        });

        JTextArea inputArea = new JTextArea();

        panel.add(jRadioButtonStack);
        panel.add(jRadioButtonQueue);

        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO: 03.10.2024 CODE HERE
            }
        });

        buttonRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO: 03.10.2024 CODE HERE
            }
        });

        add(controller.getOutputView());
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setVisible(true);
    }


}
