abstract class Shape{
 abstract void area1(int r);
 //abstract void area2(int l,int b);
}
class Circle extends Shape{
void area1(int r){
	System.out.println("The area of Circle is "+((22/7.0)*r*r));
}
}
class Square extends Shape{
	void area1(int r){
		System.out.println("The area of Square is "+(r*r));
	}
}
// class Rectangle extends Shape{
// 	void area2(int l,int b){
// 		System.out.println("The area of Rectangle is "+(l*b));
// 	}
// }
class AreaOfShapes{
	//public static void main()
	public static void main(String[] args) {
		
	Circle c=new Circle();
	c.area1(5);
	Square s=new Square();
	s.area1(4);
	// Rectangle r=new Rectangle();
	// r.area2(5,6);
}
}