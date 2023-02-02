import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// class Calc extends JFrame implements ActionListener{
// JTextField t1,t2;
// Container c;
// JLabel l1;
// JButton b1,b2,b3,b4;
// Calc(){
// setDefaultCloseOperation(EXIT_ON_CLOSE);
// setLayout(null);
// setVisible(true);
// t1=new JTextField(60);
// t2=new JTextField(60);
// b1=new JButton("Add");
// b2=new JButton("Sub");
// b3=new JButton("Mul");
// b4=new JButton("Div");
// //setting the bounds
// c.setBounds(400,300,200,60);
// t1.setBounds(100,60,120,30);
// t2.setBounds(100,60,120,30);
// b1.setBounds(100,140,60,30);
// b2.setBounds(120,140,60,30);
// b3.setBounds(100,160,60,30);
// b4.setBounds(120,180,60,30);
// l1.setBounds(250,80,200,30);
// c.add(l1);
// c.add(t1);
// c.add(t2);
// c.add(b1);
// c.add(b2);
// c.add(b3);
// c.add(b4);
// b1.addActionListener(this);
// b2.addActionListener(this);
// b3.addActionListener(this);
// b4.addActionListener(this);
// setVisible(true);
// }
// public void actionPerformed(ActionEvent ae){
// 	if(ae.getSource()==b1){
// 	int n1=Integer.parseInt(t1.getText());
// 	int n2=Integer.parseInt(t2.getText());
// 	l1.setText("The Sum is "+(n1+n2));
// }
// }
// }
// class Calculator{
// public static void main(String[] args) {
// 		Calc c=new Calc();
// 		c.setBounds(400,200,400,300);
// 	 c.setVisible(true);
// 	}
// }
class MyFrame extends JFrame implements ActionListener{
JTextField t1,t2;
JLabel l1;
JButton b1,b2,b3,b4;
	MyFrame(){
setSize(300,300);
setLocation(100,100);
setDefaultCloseOperation(EXIT_ON_CLOSE);
t1=new JTextField(60);
t2=new JTextField(60);
b1=new JButton("Add");
b2=new JButton("Sub");
b3=new JButton("Mul");
b4=new JButton("Div");
//setting the bounds
t1.setBounds(100,60,120,30);
t2.setBounds(100,60,120,30);
b1.setBounds(100,140,60,30);
b2.setBounds(120,140,60,30);
b3.setBounds(100,160,60,30);
b4.setBounds(120,180,60,30);
l1.setBounds(250,80,200,30);
add(l1);
add(t1);
add(t2);
add(b1);
add(b2);
add(b3);
add(b4);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
setVisible(true);
}
public void actionPerformed(ActionEvent ae){
	if(ae.getSource()==b1){
	int n1=Integer.parseInt(t1.getText());
	int n2=Integer.parseInt(t2.getText());
	l1.setText("The Sum is "+(n1+n2));
}
}
}
class Calculator{
	 public static void main(String[] args) {
	MyFrame f=new MyFrame();
	}
}