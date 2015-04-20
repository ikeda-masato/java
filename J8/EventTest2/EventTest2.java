//EventTest2.java

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class EventTest2 extends Applet implements KeyListener{
    private int myColor;
    private Color colorTable[]={Color.red,Color.green,Color.blue};

    public void init(){
	myColor=0;
	addKeyListener(this);
    }

    public void paint(Graphics g){
	g.setColor(colorTable[myColor]);
	g.fillOval(10,10,80,80);
    }

    //Methods for keyListener

    public void keyPressed(KeyEvent e){
	char i=e.getKeyChar();
	if(i=='r'){
	    myColor=0;
	}else if(i=='g'){
	    myColor=1;
	}else if(i=='b'){
	    myColor=2;
	}
	repaint();
    }

    public void keyReleased(KeyEvent e){}
    public void keyTyped(KeyEvent e){}
   
}