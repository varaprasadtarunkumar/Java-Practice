import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
/* <applet code="X_Y_PositionDisplay" width=400 height=400> </applet> */
public class X_Y_PositionDisplay extends Applet implements MouseMotionListener{
	public int x,y;
	public void init(){
		addMouseMotionListener(this);
	}
	public void paint(Graphics g){
		g.drawString("X:="+x+"Y:="+y,x,y);
	}
	public void mouseMoved(MouseEvent me){
		x=me.getX();
		y=me.getY();
		repaint();
	}
	public void mouseDragged(MouseEvent me){
		x=getX();
		y=getY();
		repaint();
	}
}