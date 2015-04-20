//ex3.java
import java.awt.Graphics;

class ex3{
    private int x;
    private int y;
    private int h;
    private int w;
  

    public ex3(int xPosition,int yPosition,int wide,int high){
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
	int s[]={60+x,40+x,40+x,60+x,80+x};
	int t[]={20+y,30+y,50+y,60+y,40+y};
	g.drawPolygon(s,t,5);
    }
}