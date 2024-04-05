package com.genadi.petkov;

import javax.swing.*;
import java.awt.*;

public class Button extends JButton {
    private JLabel nameOfButton = new JLabel();
    public Button() {
        this.setPreferredSize(new Dimension(250,100));
        this.setBackground(Color.BLACK);
        setNameOfButton("");
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        this.setLayout(new BorderLayout());
        this.add(nameOfButton, BorderLayout.CENTER);

        nameOfButton.setHorizontalAlignment(SwingConstants.CENTER);
        nameOfButton.setVerticalAlignment(SwingConstants.CENTER);
        nameOfButton.setBorder(BorderFactory.createLineBorder(Color.WHITE));

        // Make the label opaque
//        name.setOpaque(true);

        // Set the background color of the label
        nameOfButton.setForeground(Color.BLACK);
    }

    public void setNameOfButton(String name) {
        this.nameOfButton.setText(name);
    }
}
