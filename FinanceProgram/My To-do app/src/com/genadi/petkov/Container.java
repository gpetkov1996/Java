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
    private JPanel panel = new JPanel();
    public Container() {

        this.setSize(500,500);
        this.getContentPane().setBackground(Color.GRAY);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.add(title, BorderLayout.NORTH);
        this.add(list, BorderLayout.CENTER);
        this.add(panel, BorderLayout.SOUTH);

        this.panel.setPreferredSize(new Dimension(500,100));
//        this.panel.setBackground(Color.WHITE);
        this.panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        // Set layout to BorderLayout and add label to the center
        this.panel.setLayout(new BorderLayout());
        this.panel.add(addButton, BorderLayout.WEST);
        addButton.setNameOfButton("Add");
        addButton.setBackground(Color.BLACK);

        this.panel.add(refButton, BorderLayout.EAST);
        refButton.setNameOfButton("Refresh");
        refButton.setBackground(Color.BLACK);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list.add(new Task());
                list.revalidate();
                list.repaint();
            }
        });

        refButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Component[] components = list.getComponents();
                for(Component c : components) {
                    if (c instanceof Task && ((Task) c).isHasValue() == false) {
                        list.remove(c);
                    }
                }
                list.revalidate();
                list.repaint();
            }
        });

    }
}
