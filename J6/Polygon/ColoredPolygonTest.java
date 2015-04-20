//ColoredPolygonTest.java

import java.awt.*;
import java.util.Random;
import java.applet.Applet;

public class ColoredPolygonTest extends Applet{
    public void paint(Graphics g){
	g.setColor(Color.lightGray);
	g.fillRect(0,0,400,500);
	int z=0;
	int x[]={66,100,165,1,21,99,69,244,25,0,25,222,32,69,2,125,0,147,33,2,255,200,58};
	int y[]={21,200,23,158,38,145,132,231,22,0,213,15,24,128,256,1,96,235,1,55,89,15,44};
	Color c[]={Color.green,Color.lightGray,Color.red,Color.lightGray,Color.blue,Color.lightGray,Color.orange,Color.lightGray,Color.yellow,Color.lightGray,Color.black,Color.lightGray,Color.magenta,Color.lightGray,Color.cyan,Color.lightGray,Color.white,Color.lightGray,Color.pink,Color.lightGray};
	while(true){
	for(int i=0;i<20;i++){
	for(long j=0;j<800000;j++){
	ColoredPolygon a=new ColoredPolygon(0,0,50,30,c[i]);
	a.setColor(c[i]);
	a.draw(g);
	a.moveTo(x[i],y[i]);
	a.draw(g);
	}
	}
	}
    

    }
}