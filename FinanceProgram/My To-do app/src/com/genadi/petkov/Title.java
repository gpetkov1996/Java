package com.genadi.petkov;

import javax.swing.*;
import java.awt.*;

public class Title extends JPanel {
    private JLabel name = new JLabel("To-Do App");

    public Title() {
        this.setPreferredSize(new Dimension(500,100));
        this.setBackground(Color.BLACK);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        this.setLayout(new BorderLayout());
        this.add(name, BorderLayout.CENTER);

        name.setHorizontalAlignment(SwingConstants.CENTER);
        name.setVerticalAlignment(SwingConstants.CENTER);
        name.setForeground(Color.WHITE);
    }
}
