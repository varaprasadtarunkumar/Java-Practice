import java.util.*;
public class ThrowsDemo{
    public static void divide(int a,int b) throws ArithmeticException
    {
            System.out.println("The division of a and b is "+a/b);
    }
    public static void main(String args[]){
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of a and b");
        a=sc.nextInt();
        b=sc.nextInt();
        try{
            divide(a,b);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}