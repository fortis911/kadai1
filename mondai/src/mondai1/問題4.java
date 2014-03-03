package mondai1;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class 問題4 extends Applet {
    public void paint(Graphics g){
        g.fillRect(0,0,250,150 );
        
        // 1 段め
        g.setColor(Color.white);
        g.fillRect(25,15,50,40);
        g.setColor(Color.black);
        g.setColor(Color.green);
        g.fillRect(75,15,50,40);
        g.setColor(Color.yellow);
        g.fillRect(125,15,50,40);
        g.setColor(Color.magenta);
        g.fillRect(175,15,50,40);
        
        // 2 段め
        g.setColor(Color.blue);
        g.fillRect(25,55,50,40);
        g.setColor(Color.pink);
        g.fillRect(75,55,50,40);
        g.setColor(Color.orange);
        g.fillRect(125,55,50,40);
        g.setColor(Color.cyan);
        g.fillRect(175,55,50,40);
        
        
        // 3 段め
        g.setColor(Color.red);
        g.fillRect(25,95,50,40);
        g.setColor(Color.lightGray);
        g.fillRect(75,95,50,40);
        g.setColor(Color.gray);
        g.fillRect(125,95,50,40);
        g.setColor(Color.darkGray);
        g.fillRect(175,95,50,40);
    }
}