/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mytodolist;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author genadipetkov
 */
public class Button extends JPanel {
    
    private final JButton button = new JButton();
    private Boolean buttonIsPressed = false;
    
    public Button(String name) {
        
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(350, 100));
        setBackground(Color.BLACK);

        
        button.setPreferredSize(new Dimension(350, 100));
        button.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        
        button.setText(name);
        button.setHorizontalAlignment(SwingConstants.CENTER);
        button.setForeground(Color.WHITE);
        
        add(button, BorderLayout.CENTER);
    }  

     public JButton getButton() {
        return button;
    }
     
     public void setNewColor() {
         button.setForeground(Color.GREEN);
     }
     
     public void isPressed() {
         buttonIsPressed = true;
     }   
     
     public Boolean getIsPressed() {
        return buttonIsPressed;
    }
}
