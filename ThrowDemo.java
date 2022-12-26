import java.util.*;
public class ThrowDemo{
    public static void main(String args[]){
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of a and b");
        a=sc.nextInt();
        b=sc.nextInt();
        if(b==0){
            throw new ArithmeticException("Division by zero !");
        }
        else{
            System.out.println("The division of a and b is "+a/b);
        }
    }
}