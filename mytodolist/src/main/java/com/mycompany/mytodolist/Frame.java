/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mytodolist;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author genadipetkov
 */
class Frame extends JFrame {
    
    private final JPanel mainPanel = new JPanel();
    private final JPanel bottomJPanel = new JPanel();
    private final JPanel middlePanel = new JPanel();
    private final JPanel listPanel = new JPanel();
    private final Task task = new Task();
    private final Button addButton = new Button("Add");
    private final Button refButton = new Button("Refresh");
    
    public Frame() {
        setSize(700, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        getContentPane().add(mainPanel);
        
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setPreferredSize(new Dimension(700,700));
        mainPanel.setBackground(Color.GRAY);
        
        mainPanel.add(new Title(), BorderLayout.NORTH);
        
//        middlePanel.setLayout(new BoxLayout(middlePanel, BoxLayout.Y_AXIS));
        middlePanel.setLayout(new BorderLayout());
        middlePanel.setPreferredSize(new Dimension(700,500));
        
        listPanel.setLayout(new BoxLayout(listPanel, BoxLayout.Y_AXIS));
        
        JScrollPane scrollPane = new JScrollPane(listPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        
        middlePanel.add(scrollPane, BorderLayout.CENTER);
        
        mainPanel.add(middlePanel, BorderLayout.CENTER);
        
        bottomJPanel.setLayout(new BorderLayout());
        bottomJPanel.setPreferredSize(new Dimension(700,100));
        bottomJPanel.add(addButton, BorderLayout.WEST);
        bottomJPanel.add(refButton, BorderLayout.EAST);

        mainPanel.add(bottomJPanel, BorderLayout.SOUTH);
        
        revalidate();
        repaint();
        
        addButton.getButton().addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                listPanel.add(new Task());
                listPanel.revalidate();
                listPanel.repaint();
            }
        });
        
        refButton.getButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Component[] components = listPanel.getComponents();

                for (Component c : components) {
                    if (c instanceof Task) {
                        Task t = (Task) c; // Cast the component to Task
                        if (t.getDone().getIsPressed()) {
                            listPanel.remove(t);
                        }
                    }
                }
                listPanel.revalidate();
                listPanel.repaint();
            }
        });
    }
}
