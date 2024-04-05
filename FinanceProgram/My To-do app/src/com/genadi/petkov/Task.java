package com.genadi.petkov;

import javax.swing.*;
import java.awt.*;

public class Task extends JPanel {

    private JTextField name = new JTextField("Add task here");
    private JButton done = new JButton("Done");

    public JButton getDone() {
        return done;
    }

    public Task() {
        this.setPreferredSize(new Dimension(500, 100));
        this.setBackground(Color.WHITE);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.setLayout(new BorderLayout());
        this.add(name, BorderLayout.EAST);
        this.add(done, BorderLayout.WEST);

        this.name.setPreferredSize(new Dimension(400,100));
        this.name.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.name.setHorizontalAlignment(SwingConstants.CENTER);

        this.done.setPreferredSize(new Dimension(100,100));
        this.done.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.done.setHorizontalAlignment(SwingConstants.CENTER);
        this.done.setForeground(Color.GREEN);


    }

    // Getter and setter methods for the name field can be added here if needed
}
