//EventTest.java

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class EventTest extends Applet implements MouseListener{
    private int myColor,a=0;
    private Color colorTable[]={Color.red,Color.green,Color.blue};

    public void init(){
	myColor=0;
	addMouseListener(this);
    }

    public void paint(Graphics g){
	g.setColor(colorTable[myColor]);
	g.fillOval(10,10,80,80);
       
    }

    //Methods for mouseListener

    public void mousePressed(MouseEvent e){
	int i[]={0,1,1,2,2,0,0};
	//myColor=(myColor+1)%colorTable.length;
	myColor=i[a];
	if(a==6){
	    a=0;
	}
	a++;
	repaint();
    }

    public void mouseClicked(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
}