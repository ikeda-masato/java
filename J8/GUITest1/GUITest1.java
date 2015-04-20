//GUITest1.java

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class GUITest1 extends Applet implements ActionListener{
    private int myColor;
    private Color colorTable[]={Color.red,Color.green,Color.blue};
    private Button rb,gb,bb;
    private Label label;

    public void init(){
	myColor=0;
	rb=new Button("Red");
	gb=new Button("Green");
	bb=new Button("Blue");
	label= new Label("Red      ");
	add(rb);
	add(gb);
	add(bb);
	add(label);

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
	    label.setText("Red");
	}else if(e.getSource()==gb){
	    myColor=1;
	    label.setText("Green");
	}else {
	    myColor=2;
	    label.setText("Blue");
	}
	repaint();
    }
}