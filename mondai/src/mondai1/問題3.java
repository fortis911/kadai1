package mondai1;

import java.applet.Applet;
import java.awt.Graphics;


public class 問題3 extends Applet {
	public void paint(Graphics g){
		
		g.drawRect(50, 25, 150, 100); //縦横比=2:3の長方形
		g.fillOval(100, 50, 50, 50); //円が長方形の中央になるような始点(100,50)
	                                 //円の直径は長方形の縦の長さの半分
	}
}
