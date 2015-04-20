//ColoredDiamondTest.java

import java.awt.*;
import java.applet.Applet;

public class ColoredDiamondTest extends Applet{
    public void paint(Graphics g){
	g.setColor(Color.lightGray);
	g.fillRect(0,0,400,500);
	int x=0,y=0;
	Color c[]={Color.green,Color.red,Color.blue,Color.orange,Color.yellow,Color.black,Color.magenta,Color.cyan,Color.white,Color.pink};
	for(int i=0;i<10;i++){
	    ColoredDiamond a=new ColoredDiamond(x,y,50,30,c[i]);
	a.setColor(c[i]);
	a.draw(g);
	x=x+20;
	y=y+20;
	}

    }
}