//DiamondApplet.java
import java.applet.Applet;
import java.awt.*;

public class DiamondApplet extends Applet{
    public void paint(Graphics g){

	g.setColor(Color.lightGray);
	g.fillRect(0,0,400,500);
	int x=0,y=0;
	for(int i=0;i<10;i++){
	    Diamond c = new Diamond(x,y,50,30);
	g.setColor(Color.black);
	c.draw(g);
	x=x+28;
	y=y+18;
	}
	
	
    }
}