import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/* <applet code="AppletPainting" width=400 height=400> </applet> */
public class AppletPainting extends Applet implements MouseMotionListener{
	public void init(){
		addMouseMotionListener(this);
		setBackground(Color.red);
	}
	public void mouseDragged(MouseEvent me){
		Graphics g=getGraphics();
		g.setColor(Color.white);
		g.fillOval(me.getX(),me.getY(),5,5);
	}
	 public void mouseMoved(MouseEvent me){

	 }
}