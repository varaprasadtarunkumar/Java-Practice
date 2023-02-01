import java.awt.*;
import java.text.*;
import java.util.*;
import javax.swing.*;
public class DigitalClock{
public static class MyFrame extends JFrame{
 Calendar calendar;
 SimpleDateFormat timeFormat;
 JLabel timeLabel;
 String time;
 MyFrame(){
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  this.setTitle("My Clock Program");
  this.setLayout(new FlowLayout());
  this.setSize(350,200);
  
  timeFormat = new SimpleDateFormat("hh:mm:ss a");
  timeLabel = new JLabel();
  this.add(timeLabel);
  this.setVisible(true);
  
  setTime();
 }
 
 public void setTime() {
  while(true) {
  time = timeFormat.format(Calendar.getInstance().getTime());
  timeLabel.setText(time);
  try {
   Thread.sleep(1000);
  } catch (InterruptedException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
  }
 }
}
 public static void main(String[] args) {
 MyFrame mf= new MyFrame();
}
}


