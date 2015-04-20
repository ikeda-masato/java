//Circle.java

import java.awt.*;

class Circle3{
    private int x;
    private int y;
    private int r;

    //constructure1
    public Circle3(int vx,int vy,int vr){
	x=vx;
	y=vy;
	r=vr;
    }

    //constructer2
    public Circle3(int vr){
	x=y=100;
	r=vr;
    }

    //access methods
    public int xPosition(){return x;}
    public int yPosition(){return y;}
    public int radius(){return r;}

    public void moveTo(int newX,int newY){
	x=newX;
	y=newY;
    }

    public void draw(Graphics g){
	g.drawOval(x-r,y-r,2*r,2*r);
    }
}