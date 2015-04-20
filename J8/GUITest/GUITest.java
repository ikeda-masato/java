//GUITest.java

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class GUITest extends Applet implements ActionListener{
    private int myColor;
    private Color colorTable[]={Color.red,Color.green,Color.blue};
    private Button rb,gb,bb;

    public void init(){
	myColor=0;
	rb=new Button("Red");
	gb=new Button("Green");
	bb=new Button("Blue");

	add(rb);
	add(gb);
	add(bb);

	rb.addActionListener(this);
	gb.addActionListener(this);
	bb.addActionListener(this);
    }

    public void paint(Graphics g){
	g.setColor(colorTable[myColor]);
	g.fillOval(10,10,80,80);
    }

    public void actionPerformed(ActionEvent e){
	if(e.getSource()==rb){
	    myColor=0;
	}else if(e.getSource()==gb){
	    myColor=1;
	}else {
	    myColor=2;
	}
	repaint();
    }
}