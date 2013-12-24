import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Gui{
    private JFrame frame;
    private JLabel l1,l2,l3,l4;
    private Canvas canvas;

    public Gui(){
        frame = new JFrame();
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("Label 1",SwingConstants.RIGHT);
        l2 = new JLabel("Label 2",SwingConstants.RIGHT);
        canvas = new Canvas();
        canvas.setSize(100,100);
        canvas.setBackground(Color.white);

        frame.add(l1,BorderLayout.LINE_START);
        frame.add(canvas,BorderLayout.CENTER);
        frame.add(l2,BorderLayout.LINE_END);

        frame.setTitle("GUI Testing");
        frame.setSize(550,600);
        frame.setVisible(true);
    }
}
