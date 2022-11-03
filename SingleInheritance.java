import java.lang.*;
import java.io.*;
import java.util.*;
class Parent{
    int a=15;
}
class Child extends Parent{
    int b=20;
}
public class SingleInheritance{
public static void main(String args[]){
 Child ch=new Child();
 System.out.println("The sum of a(From Parent class) and b(From Child class) is "+(ch.a+ch.b));
}
}
  
