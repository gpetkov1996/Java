package app.finance;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class TitleBar extends JPanel {

    private JLabel titleBar;
    private JLabel amount;
    private JLabel label;
    private JLabel totalLeft;

    Border border = BorderFactory.createLineBorder(Color.black);
    public TitleBar() {
        this.setPreferredSize(new Dimension(400, 80));

        titleBar = new JLabel("Personal Finance");
        titleBar.setFont(new Font("Sans-serif", Font.BOLD, 20));
        titleBar.setBorder(border);
        titleBar.setHorizontalAlignment(JLabel.CENTER);

        this.add(titleBar);

        amount = new JLabel("Amount");
        amount.setFont(new Font("Sans-serif", Font.BOLD, 20));
        amount.setBorder(border);
        amount.setHorizontalAlignment(JLabel.CENTER);

        this.add(amount);

        label = new JLabel("Label");
        label.setFont(new Font("Sans-serif", Font.BOLD, 20));
        label.setBorder(border);
        label.setHorizontalAlignment(JLabel.CENTER);

        this.add(label);

        totalLeft = new JLabel("Total Left");
        totalLeft.setFont(new Font("Sans-serif", Font.BOLD, 20));
        totalLeft.setBorder(border);
        totalLeft.setHorizontalAlignment(JLabel.CENTER);


        this.add(totalLeft);
    }

    public JLabel getTitleBar() {
        return titleBar;
    }

    public JLabel getAmount() {
        return amount;
    }

    public JLabel getLabel() {
        return label;
    }

    public JLabel getTotalLeft() {
        return totalLeft;
    }
}
