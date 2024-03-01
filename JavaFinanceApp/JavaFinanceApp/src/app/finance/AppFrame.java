package app.finance;

import javax.swing.*;
import java.awt.*;

public class AppFrame extends JFrame {
    private TitleBar titleBar;
    private JLabel titleLabel;
    private JLabel amount;
    private JLabel label;
    private JLabel totalLeft;
    private Button button;

    public AppFrame() throws HeadlessException {
        this.setSize(400, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        this.titleBar = new TitleBar();
        this.add(titleBar, BorderLayout.CENTER);

        titleLabel = titleBar.getTitleBar();
        this.add(titleLabel, BorderLayout.NORTH);

        amount = titleBar.getAmount();
        this.add(amount, BorderLayout.WEST);

        label = titleBar.getLabel();
        this.add(label, BorderLayout.EAST);

        totalLeft = titleBar.getTotalLeft();
        this.add(totalLeft, BorderLayout.CENTER);


    }
}
