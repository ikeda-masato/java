//ColoredDiamond.java

import java.awt.*;

class ColoredDiamond extends Diamond{
    private Color c;
    
    public ColoredDiamond(int vx, int vy, int vw, int vh,Color vc){
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
}