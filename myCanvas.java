import javax.swing.*;
import java.awt.*;

public class myCanvas extends Canvas{
    public myCanvas(){
        setSize(200,200);
        setBackground(Color.white);
    }

    public void paint(Graphics g){
        g.drawLine(100,100,150,150);
        g.drawLine(10,10,250,250);
    }
}
