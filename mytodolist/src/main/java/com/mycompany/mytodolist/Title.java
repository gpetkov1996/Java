/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mytodolist;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author genadipetkov
 */
public class Title extends JPanel {
    
    private final JLabel titleName = new JLabel("To-Do List");
    
    public Title () {
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(700,100));
        setBackground(Color.BLACK);
        add(titleName,BorderLayout.CENTER);
        titleName.setHorizontalAlignment(JLabel.CENTER);
        titleName.setForeground(Color.WHITE);
    }
}
