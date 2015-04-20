//InterfaceTest.java

import java.awt.*;
import java.applet.Applet;

interface Colorable{
    public void setColor(Color vc);
    public Color getColor();
}

interface Figure{
    public void draw(Graphics g);
    public void move(int dx,int dy);
}

class OvalFigure implements Figure{
    private int x,y;
    private int width,height;

    public OvalFigure(int vx,int vy,int vw,int vh){
	x=vx;
	y=vy;
	width=vw;
	height=vh;
    }

    public void draw(Graphics g){
	g.drawOval(x,y,width,height);
    }

    public void move(int dx,int dy){
	x=x+dx;
	y=y+dy;
    }
}
class ColoredOval extends OvalFigure implements Colorable{
    private Color c;

    public ColoredOval(int vx,int vy,int vw,int vh,Color vc){
	super(vx,vy,vw,vh);
	c=vc;
    }

    public void draw(Graphics g){
	g.setColor(c);
	super.draw(g);
    }

    public void setColor(Color vc){
	c=vc;
    }
    
    public Color getColor(){
	return c;
    }
}

public class InterfaceTest extends Applet{
    public void paint(Graphics g){
	ColoredOval co=new ColoredOval(10,10,80,60,Color.red);

	for(int i=0;i<20;i++){
	    co.draw(g);
	    co.move(5,5);
	}
    }
}