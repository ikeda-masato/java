import java.applet.Applet;
import java.awt.*;

class ThreadAp extends Thread{
    int id,sleepTime,x,y,r,myColor;
    Color colorTable[]={Color.blue,Color.yellow,Color.red,Color.green};
    
    public ThreadAp(int vid,int vst,int vx,int vy,int vr){
	id=vid;
	sleepTime=vst;
	x=vx;
	y=vy;
	r=vr;
	myColor=id;
    }

    public void draw(Graphics g){
	g.setColor(colorTable[myColor]);
	g.fillOval(x-r,y-r,2*r,2*r);
    }

    public void run(){
	try{
	    while(true){
		sleep(sleepTime);
		myColor=(myColor+id+1)%colorTable.length;
		if(id==0){
		    System.out.println("Thread1");}
		if(id==1){
		    System.out.println("Thread2");}
		if(id==2){
		    System.out.println("Thread3");}
	    }
	}
	catch (InterruptedException e){}
	}
    
}

public class ThreadApplet extends Applet{
    public void paint(Graphics g){
	ThreadAp t1=new ThreadAp(0,1000,100,100,100);
	ThreadAp t2=new ThreadAp(1,2000,300,100,100);
	ThreadAp t3=new ThreadAp(2,1500,500,100,100);
	t1.start();
	t2.start();
	t3.start();
	while(true){
	    t1.draw(g);
	    t2.draw(g);
	    t3.draw(g);
	
	}
    }
}
