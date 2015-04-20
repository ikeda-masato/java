//ColoredCircleTest.java

import java.awt.*;
import java.applet.Applet;

public class ColoredCircleTest extends Applet{
    public void paint(Graphics g){
	ColoredCircle a=new ColoredCircle(50,50,10,Color.green);
	ColoredCircle b=new ColoredCircle(50,50,20,Color.blue);
	ColoredCircle c=new ColoredCircle(50,50,30,Color.red);
	a.draw(g);
	b.draw(g);
	c.draw(g);
    }
}