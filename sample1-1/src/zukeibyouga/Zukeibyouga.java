package zukeibyouga;

import java.applet.Applet;
import java.awt.Graphics;

public class  Zukeibyouga extends Applet
{
public void paint(Graphics g){
	
	g.drawRect(30,30,40,100);
	g.fillRect(40,40,20,80);
	g.drawLine(160, 80, 220, 120);
	g.drawOval(90,30,60,40);
	g.fillOval(100, 40, 40, 20);
	g.drawRoundRect(90, 80, 60, 60, 40, 40);
	g.fillRoundRect(100, 90, 40, 40, 20, 20);
	g.drawArc(120, 60, 120, 80, 240, 150);
	g.fillArc(120, 30, 120, 80, 0, 90);
}
}
