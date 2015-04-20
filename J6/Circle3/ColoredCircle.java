//ColoredCircle.java

import java.awt.*;

class ColoredCircle extends Circle3{
    private Color c;

    public ColoredCircle(int vx,int vy,int vr,Color vc){
	super(vx,vy,vr);
	c=vc;
    }
    public ColoredCircle(int vr,Color vc){
	super(vr);
	c=vc;
	    }

    public void draw(Graphics g){
	g.setColor(c);
	super.draw(g);
    }
}
