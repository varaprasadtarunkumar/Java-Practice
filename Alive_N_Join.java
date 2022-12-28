import java.lang.*;
import java.io.*;
class MyThread extends Thread{
    public void run(){
        for(int i=1;i<5;i++){
                   System.out.println("Child Thread i= "+i);
        }
        System.out.println("Exiting from Child Thread");
    }
}
class Alive_N_Join{
    public static void main(String args[]) throws Exception{
        MyThread t=new MyThread();
       
       System.out.println(t.isAlive()+"\n");
        System.out.println("Thread Started");
        t.start();
       System.out.println(t.isAlive());
        t.join();
        for(int j=1;j<5;j++){
            System.out.println("Main Thread j="+j);
        }
        System.out.println("Exiting from main");
    }
}
