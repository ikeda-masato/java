//Hexagon.java
import java.awt.Graphics;

class Hexagon{
    private int x;
    private int y;
    private int h;
    private int w;
  

    public Hexagon(int xPosition,int yPosition,int wide,int high){
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
	int s[]={20+x,40+x,60+x,60+x,40+x,20+x};
	int t[]={40+y,20+y,40+y,70+y,90+y,70+y};
	g.drawPolygon(s,t,6);
    }
}