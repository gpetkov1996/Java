package com.genadi.petkov;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Container extends JFrame {
    private Title title = new Title();
    private ListOfTasks list = new ListOfTasks();
    private Button addButton = new Button();
    private Button refButton = new Button();
    private JPanel panel = new JPanel();
    private JPanel panelForFrame = new JPanel();
    private JPanel middlePanel = new JPanel();

    public Container() {
        panelForFrame.setPreferredSize(new Dimension(700, 700));
        this.getContentPane().add(panelForFrame);
        this.setSize(700,700);
        this.panelForFrame.setBackground(Color.GRAY);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.panelForFrame.setLayout(new BorderLayout());
        this.panelForFrame.add(title, BorderLayout.NORTH);
        this.panelForFrame.add(middlePanel, BorderLayout.CENTER);
        this.panelForFrame.add(panel, BorderLayout.SOUTH);

        this.middlePanel.setPreferredSize(new Dimension(500,300));
        this.middlePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.middlePanel.setLayout(new BorderLayout());
        this.middlePanel.add(list, BorderLayout.CENTER);

//        JScrollPane scrollPane = new JScrollPane(list);
//        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
//        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//        this.middlePanel.add(scrollPane, BorderLayout.CENTER);

        this.panel.setPreferredSize(new Dimension(500,100));
        this.panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
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
