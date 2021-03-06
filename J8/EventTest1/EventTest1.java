//EventTest1.java

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class EventTest1 extends Applet implements KeyListener{
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
	myColor=(myColor+1)%colorTable.length;
	repaint();
    }

    public void keyReleased(KeyEvent e){}
    public void keyTyped(KeyEvent e){}
   
}