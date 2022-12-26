class Nested_Try_Block{
    public static void main(String[] args){
        try{
            int[] a=new  int[5];
        try{
            a[3]=30/0;
        }
        catch(ArithmeticException e){
            System.out.println(e+"\n");
        }
        a[10]=69;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e+"\n");
        }
        finally{
            System.out.println("The end of the program(made using finally block)");
        }
}
}