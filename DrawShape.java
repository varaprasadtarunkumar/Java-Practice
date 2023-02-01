import java.applet.Applet;
import java.awt.*;
/* <applet code="DrawShape" width=400 height=400> </applet>*/
public class DrawShape extends Applet{
	public void paint(Graphics g){
		g.setColor(Color.red);
		g.fillRect(100,100,130,130);
		// g.setColor(Color.green);
		// g.fillRect(120,120,120,120);
		g.setColor(Color.yellow);
		g.fillOval(120,130,140,150);
		g.setColor(Color.blue);
		g.fillArc(200, 100, 100, 50, 0, 90);
	}
}