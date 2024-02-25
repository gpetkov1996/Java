package classes;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Task extends JPanel {

    private JLabel index;
    private JTextField taskName;
    private JButton done;
    private boolean checked;

    //Constructor
    public Task() {
        this.setPreferredSize(new Dimension(40, 20));

        this.setLayout(new BorderLayout());

        checked = false;

        index = new JLabel("");
        index.setPreferredSize(new Dimension(20, 20));
        index.setHorizontalAlignment(JLabel.CENTER);
        index.setBorder(BorderFactory.createLineBorder(Color.black));
        this.add(index, BorderLayout.WEST);

        taskName = new JTextField("Your task here");
        taskName.setBorder(BorderFactory.createLineBorder(Color.black));

        this.add(taskName, BorderLayout.CENTER);

        done = new JButton("Done");
        done.setPreferredSize(new Dimension(40, 20));
        done.setBorder(BorderFactory.createLineBorder(Color.black));

        this.add(done, BorderLayout.EAST);
    }

    public boolean isChecked() {
        return checked;
    }

    public JButton getDone() {
        return done;
    }

    public void changeIndex(int num) {
        this.index.setText(String.valueOf(num));
        this.revalidate();
    }

    public void changeState() {
        this.setBackground(Color.green);
        taskName.setBackground(Color.green);
        checked = true;
    }
}
