//GUITest.java

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class GUITest10 extends Applet implements ActionListener{
    private int myColor;
    private Color colorTable[]={Color.red,Color.green,Color.blue,Color.orange,Color.cyan,Color.yellow,Color.pink,Color.black,Color.gray,Color.magenta};
    private Button rb,gb,bb,ob,cb,yb,pb,blb,grb,mb;

    public void init(){
	myColor=0;
	rb=new Button("Red");
	gb=new Button("Green");
	bb=new Button("Blue");
	ob=new Button("Orange");
	cb=new Button("Cyan");
	yb=new Button("Yellow");
	pb=new Button("Pink");
	blb=new Button("Black");
	grb=new Button("Gray");
	mb=new Button("Magenta");

	add(rb);
	add(gb);
	add(bb);
	add(ob);
	add(cb);
	add(yb);
	add(pb);
	add(blb);
	add(grb);
	add(mb);

	rb.addActionListener(this);
	gb.addActionListener(this);
	bb.addActionListener(this);
	ob.addActionListener(this);
	cb.addActionListener(this);
	yb.addActionListener(this);
	pb.addActionListener(this);
	blb.addActionListener(this);
	grb.addActionListener(this);
	mb.addActionListener(this);
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
	}else if(e.getSource()==bb){
	    myColor=2;
	}else if(e.getSource()==ob){
	    myColor=3;
	}else if(e.getSource()==cb){
	    myColor=4;
	}else if(e.getSource()==yb){
	    myColor=5;
	}else if(e.getSource()==pb){
	    myColor=6;
	}else if(e.getSource()==blb){
	    myColor=7;
	}else if(e.getSource()==grb){
	    myColor=8;
	}else{
	    myColor=9;
	}
	    repaint();
	    
    }
}