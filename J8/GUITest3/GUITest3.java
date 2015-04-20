//GUITest3.java

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class GUITest3 extends Applet implements ActionListener{
    private int myColor;
    private Color colorTable[]={Color.red,Color.blue,Color.yellow};
    private Button tr,qu,pe;
 
    public void init(){
	myColor=0;
	tr=new Button("Triangle");
	qu=new Button("Quadrangle");
	pe=new Button("Pentagon");

	add(tr);
	add(qu);
	add(pe);

	tr.addActionListener(this);
	qu.addActionListener(this);
	pe.addActionListener(this);
    }

    public void paint(Graphics g){
	g.setColor(colorTable[myColor]);
	g.fillOval(10,10,80,80);

    }

    public void actionPerformed(ActionEvent e){
	if(e.getSource()==tr){
	g.fillOval(10,10,80,80);
	}else if(e.getSource()==qu){
	    myColor=1;
	}else {
	    myColor=2;
	}
	repaint();
    }
}