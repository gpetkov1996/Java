package classes;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ButtonPanel extends JPanel{

    private JButton addTask;
    private JButton clear;
    private JButton percentage;

    Border emptyBorder = BorderFactory.createLineBorder(Color.black);
    //Constructor
    public ButtonPanel() {
        this.setPreferredSize(new Dimension(400, 60));

        addTask = new JButton("Add Task");
        addTask.setBorder(emptyBorder);
        addTask.setFont(new Font("Sans-serif", Font.PLAIN, 20));

        this.add(addTask);

        this.add(Box.createHorizontalStrut(20));

        percentage = new JButton("0%");
        percentage.setBorder(BorderFactory.createEmptyBorder());
        percentage.setFont(new Font("Sans-serif", Font.PLAIN, 20));

        this.add(percentage);

        this.add(Box.createHorizontalStrut(20));

        clear = new JButton("Clear Completed Tasks");
        clear.setBorder(emptyBorder);
        clear.setFont(new Font("Sans-serif", Font.PLAIN, 20));

        this.add(clear);
    }

    public JButton getAddTask() {
        return addTask;
    }

    public JButton getClear() {
        return clear;
    }

    public JButton getPercentage() {
        return percentage;
    }
}
