package com.genadi.petkov;

import javax.swing.*;
import java.awt.*;


public class ListOfTasks extends JPanel {
    private Task task = new Task();
    private JPanel panel = new JPanel();

    public ListOfTasks() {
        this.panel.setPreferredSize(new Dimension(500,100));
//        this.panel.setBackground(Color.WHITE);
        this.panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        // Set layout to BorderLayout and add label to the center
        this.panel.setLayout(new BorderLayout());
        this.panel.add(task, BorderLayout.CENTER);

        // Set label properties
//        task.set(SwingConstants.CENTER);
//        name.setVerticalAlignment(SwingConstants.CENTER);

        // Make the label opaque
//        name.setOpaque(true);

        // Set the background color of the label
//        task.setForeground(Color.BLACK);
    }
}
