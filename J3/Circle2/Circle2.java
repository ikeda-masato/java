//Circle2.java
import java.awt.Graphics;

class Circle2{
    private int x;
    private int y;
    private int r;

    public Circle2(int xPosition,int yPosition,int radius){
	x=xPosition;
	y=yPosition;
	r=radius;
    }

    public void moveTo(int newX,int newY){
	x=newX;
	y=newY;
    }
    
    public void draw(Graphics g){
	g.drawOval(x-r,y-r,2*r,2*r);
    }
}