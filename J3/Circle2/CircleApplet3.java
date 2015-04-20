//CircleApplet3.java
import java.applet.Applet;
import java.awt.*;

public class CircleApplet3 extends Applet{
    public void paint(Graphics g){
	g.setColor(Color.lightGray);
	g.fillRect(0,0,250,100);
	Circle2 c = new Circle2(20,50,20);
	g.setColor(Color.black);
	c.draw(g);
	for(long i=0;i<800000000;i++);
	g.setColor(Color.lightGray);
	c.draw(g);
	g.setColor(Color.black);
	c.moveTo(80,50);
	c.draw(g);
	for(long i=0;i<800000000;i++);
	g.setColor(Color.lightGray);
	c.draw(g);
	g.setColor(Color.black);
	c.moveTo(140,50);
	c.draw(g);
    }
}