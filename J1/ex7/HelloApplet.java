//HelloApplet.java

import java.applet.Applet;
import java.awt.Graphics;

public class HelloApplet extends Applet{
    public void paint(Graphics g){
	g.drawString("Hello world!",5,25);
    }
}