package org.example;

import javax.swing.*;
import java.awt.*;

public class Demo {
    private JPanel panelMain = new JPanel(new GridBagLayout());
    private JPanel Panel1 = new JPanel(new GridBagLayout());
    private JPanel Panel2 = new JPanel(new GridBagLayout());
    private JButton button1 = new JButton("Button");
    private JTextPane thisIsMyTextTextPane = new JTextPane();
    public void createUIComponents() {
        // TODO: place custom component creation code here
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Desktop Application");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 800); // Adjust size as needed
            frame.setLayout(new BorderLayout());
            frame.add(panelMain);
            frame.add(Panel1);
            frame.add(Panel2);
            frame.add(button1);
            frame.add(thisIsMyTextTextPane);
            frame.setVisible(true);
        });
    }
}
