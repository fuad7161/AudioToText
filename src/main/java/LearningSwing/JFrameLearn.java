package LearningSwing;

import org.example.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameLearn {
    private static final int Width = 550;
    private static final int Height = 800;
    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> {
            JFrame jframe = new JFrame("Audio to Text");
            jframe.setSize(Width,Height);
            jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jframe.setLayout(null);

            jframe.setResizable(false);
            ImageIcon imageicon = new ImageIcon(Main.class.getResource("/src/main/java/dam/microphone.png"));
            Image image = imageicon.getImage();
            Image resizeableimage = image.getScaledInstance(50,50,Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(resizeableimage);
            JButton button = new JButton(imageIcon); // add button
            JLabel label = new JLabel("Hi I am from Future."); // add label

            button.setBounds(50, 650, Width-100, 50);
            label.setBounds(50, 50, Width-100, Height-150);
            label.setBorder(BorderFactory.createLineBorder(Color.black, 2));
            button.addActionListener(e ->  { // add action listener
                label.setText("Now, It's me from Future.");
            });
            jframe.add(button); // add up button in the frame
            jframe.add(label); //  add up label in the frame
//        jframe.pack(); // will take all the space available in the frame.
            jframe.setVisible(true);
        });
    }
}
