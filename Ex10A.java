import java.lang.*;
import java.io.*;
class ThreadA extends Thread{
    public void run(){
            for(int i=1;i<=10;i++){
            try{
                sleep(1000);}
                catch(Exception e){
                    System.out.println(e);
                }
            System.out.println("Good Morning");
    }
  }    
}
class ThreadB extends Thread{
    public void run(){
        for(int j=1;j<=10;j++){
            try{
                sleep(2000);
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("Hello");
        }
    }
}
class ThreadC extends Thread{
    public void run(){
        for(int k=1;k<=10;k++){
            try{
                sleep(3000);
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("Welcome");
        }
    }
}
class Ex10A{
    public static void main(String args[]){
        ThreadA t1=new ThreadA();
        ThreadB t2=new ThreadB();
        ThreadC t3=new ThreadC();
        t1.start();
        t2.start();
        t3.start();
    }
}