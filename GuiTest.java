import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;

public class GuiTest extends JFrame{
    private JLabel l1,l2,l3;
    private myCanvas canvas;

    public GuiTest(){
        this.getContentPane().setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("Label 1",SwingConstants.RIGHT);
        l2 = new JLabel("Label 2",SwingConstants.RIGHT);
        canvas = new myCanvas();

        add(canvas);
        this.setTitle("GUI Testing");
        this.setSize(250,250);
        this.setVisible(true);
    }

}
