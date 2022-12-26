import java.lang.*;
import java.util.*;
class Finally_N_Muliple_Catch{
    public static void main(String[] args){
        try{
            int[] a=new  int[5];
            a[10]=30/0;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(ArithmeticException e){
            System.out.println(e+"\n");
        }
        finally{
            System.out.println("The end of the program(made using finally block)");
        }
}
}