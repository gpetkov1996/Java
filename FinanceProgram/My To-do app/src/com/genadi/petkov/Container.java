package com.genadi.petkov;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Container extends JFrame {
    private Title title = new Title();
    private ListOfTasks list = new ListOfTasks();
    private Button addButton = new Button();
    private Button refButton = new Button();
    private Task task = new Task();
    public Container() {

        this.setSize(500,500);
        this.getContentPane().setBackground(Color.GRAY);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.add(title, BorderLayout.NORTH);
        this.add(list, BorderLayout.CENTER);
        addButton.setNameOfButton("Add");
        this.add(addButton, BorderLayout.SOUTH);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list.add(new Task());
                list.revalidate();
                list.repaint();
            }
        });
    }
}
