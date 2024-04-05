package com.genadi.petkov;

import javax.swing.*;
import java.awt.*;

public class Title extends JPanel {
    private JLabel name = new JLabel("To-Do App");

    public Title() {
        this.setPreferredSize(new Dimension(500,100));
        this.setBackground(Color.BLACK);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        // Set layout to BorderLayout and add label to the center
        this.setLayout(new BorderLayout());
        this.add(name, BorderLayout.CENTER);

        // Set label properties
        name.setHorizontalAlignment(SwingConstants.CENTER);
        name.setVerticalAlignment(SwingConstants.CENTER);

        // Make the label opaque
//        name.setOpaque(true);

        // Set the background color of the label
        name.setForeground(Color.WHITE);
    }
}
