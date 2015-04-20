//Rectangle.java
import java.awt.Graphics;

class Rectangle{
    private int x;
    private int y;
    private int h;
    private int w;

    public Rectangle(int xPosition,int yPosition,int wide,int high){
	x=xPosition;
	y=yPosition;
	w=wide;
	h=high;
    }

    public void moveTo(int newX,int newY){
	x=newX;
	y=newY;
    }
    
    public void draw(Graphics g){
	g.drawRect(x,y,w,h);
    }
}