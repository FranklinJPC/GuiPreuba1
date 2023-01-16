import javax.swing.*;
import java.awt.*;

public class PanelDibujo extends JPanel
{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        int anchura = getWidth();
        int altura = getHeight();

        /*
        g.drawLine(55,1,anchura,altura);
        g.drawLine(63,altura,anchura,0);
        g.drawLine(0,65,65,0);
         */

        /*

        2D

        g.drawLine(50,50,150,50);
        g.drawLine(50,50,50,170);
        g.drawLine(50,95,125,95);

         */

        /* 3D */
        g.draw3DRect(10,50,25,125,true);
        g.draw3DRect(10,50,125,25,true);
        g.draw3DRect(10,95,75,25,true);

        /*
        g.drawLine(20,20,20,100);
        g.drawLine(20,20,50,75);
        g.drawLine(50,75,80,20);
        g.drawLine(80,20,80,100);


         */


    }
}
