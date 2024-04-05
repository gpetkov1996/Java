package com.genadi.petkov;

import javax.swing.*;
import java.awt.*;

public class Task extends JPanel {

    private JTextField name = new JTextField("Add task here");

    public Task() {
        this.setPreferredSize(new Dimension(500,100));
        this.setBackground(Color.WHITE);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        // Set layout to BorderLayout and add label to the center
        this.setLayout(new BorderLayout());
        this.add(name, BorderLayout.CENTER);

        // Set label properties
//        name.setHorizontalAlignment(SwingConstants.CENTER);
//        name.setVerticalAlignment(SwingConstants.CENTER);
        name.setHorizontalAlignment(SwingConstants.CENTER);

        // Make the label opaque
//        name.setOpaque(true);

        // Set the background color of the label
        name.setForeground(Color.BLACK);
    }

    @Override
    public String getName() {
        return name.getText();
    }

    public void setName(String name) {
        this.name.setText(name);
    }
}
