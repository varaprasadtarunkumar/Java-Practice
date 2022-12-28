import java.lang.*;
import java.io.*;
class MyThread extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon thread worked");
        }
        else{
            System.out.println("");
            System.out.println("User thread worked");
        }
    }
}
class DaemonThread{
    public static void main(String args[]){
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        MyThread t3=new MyThread();
        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
    }
}
