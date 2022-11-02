import java.lang.*;
import java.io.*;
import java.util.*;
class FxnOverloading{
	int add(int a,int b){
	    return (a+b);
	}
	double add(double a,double b){
	
	return (a+b);
	}
	double add(double a,int b){
	    return (a+b);
	}
	public static void main(String args[]){
	    FxnOverloading m=new FxnOverloading();
	 System.out.println("Th sum of two integers is "+m.add(5,7));
	 System.out.println("Th sum of two floats is "+m.add(5.37,7.77));
	 System.out.println("The sum of an integer and a float is "+m.add(4.32,27));
	    
	}
}
