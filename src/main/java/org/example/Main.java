package org.example;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Desktop Application");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 800); // Adjust size as needed

            JPanel mainPanel = new JPanel();
            mainPanel.setLayout(new BorderLayout());

            // Top Panel (Empty)
            JPanel topPanel = new JPanel();
            topPanel.setBackground(new Color(230, 245, 242));
            mainPanel.add(topPanel, BorderLayout.CENTER);

            // Bottom Panel with Button
            JPanel bottomPanel = new JPanel();
            bottomPanel.setBackground(new Color(173, 216, 230));
            bottomPanel.setPreferredSize(new Dimension(frame.getWidth(), 80));

            // Adding Buttons based on the provided design
            JButton micButton = new JButton(new ImageIcon("path_to_mic_icon.png")); // replace with actual icon path
            JButton circleButton = new JButton(new ImageIcon("path_to_circle_icon.png")); // replace with actual icon path

            bottomPanel.add(micButton);
            bottomPanel.add(circleButton);

            mainPanel.add(bottomPanel, BorderLayout.SOUTH);

            frame.add(mainPanel);
            frame.setVisible(true);
        });
    }
}