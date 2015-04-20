//TextApplet.java

import java.applet.Applet;
import java.awt.*;

public class TextApplet extends Applet{
    public void paint(Graphics g){
	Font ft=new Font("TimesRoman",Font.PLAIN,36);
	Font ftb=new Font("TimesRoman",Font.BOLD,36);
	Font fh=new Font("Helvetica",Font.PLAIN,36);
	Font fhi=new Font("Helvetica",Font.ITALIC,36);
	//
	g.setFont(ft);
	g.drawString("Hello World!",25,40);
	//
	g.setFont(ftb);
	g.setColor(Color.blue);
	g.drawString("Hello World!",25,80);
	//
	g.setFont(fh);
	g.setColor(Color.red);
	g.drawString("Hello World!",25,120);

	g.setFont(fhi);
	g.setColor(Color.green);
	g.drawString("Hello World!",25,160);
    }
}