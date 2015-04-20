import java.applet.Applet;
import java.awt.*;

public class ex2 extends Applet{
    public void paint(Graphics g){
	Font ft=new Font("Courier",Font.PLAIN,36);
	Font ftb=new Font("Dialog",Font.BOLD,36);
	Font fh=new Font("Serif",Font.PLAIN,36);
	Font fhi=new Font("SansSerif",Font.ITALIC,36);

	g.setFont(ft);
	g.drawString("池田 将都",25,40);

	g.setFont(ftb);
	g.setColor(Color.black);
	g.drawString("池田 将都",25,80);

	g.setFont(fh);
	g.setColor(Color.lightGray);
	g.drawString("池田 将都",25,120);

	g.setFont(fhi);
	g.setColor(Color.cyan);
	g.drawString("池田 将都",25,160);
    }
}