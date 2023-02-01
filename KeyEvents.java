import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/* <applet code="KeyEvents" width=400 height=400> </applet> */
public class KeyEvents extends Applet implements KeyListener {
  private String msg = "";
  private int x = 10, y = 20;

  public void init() {
    addKeyListener(this);
  }

  public void paint(Graphics g) {
    g.drawString(msg, x, y);
  }

  public void keyPressed(KeyEvent ke) {
    msg = "Key Down";
    repaint();
  }

  public void keyReleased(KeyEvent ke) {
    msg = "Key Up";
    repaint();
  }
  public void keyTyped(KeyEvent ke) {
  }
}