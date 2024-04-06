package com.genadi.petkov;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task extends JPanel {

    private boolean hasValue = true;
    private JTextField name = new JTextField("Add task here");
    private JButton done = new JButton("Done");

    public boolean isHasValue() {
        return hasValue;
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

        done.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name.setForeground(Color.GREEN);
                hasValue = false;
                revalidate();
                repaint();
            }
        });

    }


    // Getter and setter methods for the name field can be added here if needed
}
