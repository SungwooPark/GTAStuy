import java.io.*;
import java.util.*;
import javax.swing.*;

public class Gui{
    private JFrame frame;
    
    public Gui(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(550,600);
        frame.setVisible(true);
    }
}
