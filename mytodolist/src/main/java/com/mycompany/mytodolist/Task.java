/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mytodolist;

import static java.awt.AWTEventMulticaster.add;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author genadipetkov
 */
public class Task extends JPanel {
    
    private final JTextField taskLabel = new JTextField("Add your task here");
    private final JPanel panelForLabel = new JPanel();
    private final Button done = new Button("Done");
    
    public Task() {
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(500, 100));
        setBackground(Color.WHITE);
        
        done.setPreferredSize(new Dimension(100, 100));
        
        taskLabel.setPreferredSize(new Dimension(400, 100));
        taskLabel.setHorizontalAlignment(SwingConstants.CENTER);
        taskLabel.setForeground(Color.BLACK);
        
        panelForLabel.setLayout(new BorderLayout());
        panelForLabel.setPreferredSize(new Dimension(500,100));
        panelForLabel.setBackground(Color.WHITE);
        panelForLabel.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        panelForLabel.add(done, BorderLayout.WEST);
        panelForLabel.add(taskLabel, BorderLayout.CENTER);
        
        add(panelForLabel, BorderLayout.CENTER);
        
        done.getButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                done.setNewColor();
                taskLabel.setForeground(Color.GREEN);
                done.isPressed();
            }
        });
    }  
    
    public Button getDone() {
        return done;
    }
}
