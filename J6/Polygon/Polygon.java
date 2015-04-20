//Polygon.java
import java.awt.Graphics;

class Polygon{
    private int x;
    private int y;
    private int h;
    private int w;
  

    public Polygon(int xPosition,int yPosition,int wide,int high){
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
	int s[]={20+x,30+x,50+x,60+x,60+x,50+x,30+x,20+x};
	int t[]={40+y,20+y,20+y,40+y,50+y,60+y,60+y,50+y};
	g.drawPolygon(s,t,8);
    }
}