//ex3Appletmove.java
import java.applet.Applet;
import java.awt.*;

public class ex3Appletmove extends Applet{
    public void paint(Graphics g){

	g.setColor(Color.lightGray);
	g.fillRect(0,0,400,500);
	ex3 c = new ex3(0,0,50,30);
	g.setColor(Color.black);
	c.draw(g);
	for(long i=0;i<800000000;i++);
	g.setColor(Color.lightGray);
	c.draw(g);
	g.setColor(Color.black);
	c.moveTo(28,18);
	c.draw(g);
	for(long i=0;i<800000000;i++);
	g.setColor(Color.lightGray);
	c.draw(g);
	g.setColor(Color.black);
	c.moveTo(56,36);
	c.draw(g);
    }
}