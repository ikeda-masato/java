import java.applet.Applet;
import java.awt.*;

public class ex1 extends Applet{
    public void paint(Graphics g){
	g.setColor(Color.red);
	g.drawLine(0,100,200,100);
	g.drawLine(100,0,100,200);
	g.setColor(Color.blue);

	int olda=0;
	int oldb=0;
	for(double x=-0.99;x<=1;x=x+0.01){
	    double y=x;
	    int a=(int)(100*x+100);
	    int b=(int)(100*y+100);
	    g.drawLine(olda,oldb,a,b);
	    olda=a;
	    oldb=b;
	}
	g.setColor(Color.green);
	int oldc=0;
	int oldd=0;
	for(double x=-0.99;x<=1;x=x+0.01){
	    double y=x*x;
	    int c=(int)(100*x+100);
	    int d=(int)(-100*y+100);
	    g.drawLine(oldc,oldd,c,d);
	    oldc=c;
	    oldd=d;
	}
	g.setColor(Color.orange);
	int olde=0;
	int oldf=0;
	for(double x=-0.99;x<=1;x=x+0.01){
	    double y=x*x*x;
	    int e=(int)(100*x+100);
	    int f=(int)(-100*y+100);
	    g.drawLine(olde,oldf,e,f);
	    olde=e;
	    oldf=f;
	}


    }
}