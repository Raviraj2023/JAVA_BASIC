package org.Multithreading;

class Mythread extends Thread{
    public void run(){
        int i=1;
        while(i<=50){
            System.out.println("Hello");
            i++;
        }
    }
}
class Mythread1 implements Runnable{
   public void run(){
        for (int i=0; i<=50; i++){
            System.out.println("Raviraj");
        }
    }
}
public class Threadtest {
    public static void main(String[] args) {
        Mythread t=new Mythread();
        t.start();
        t.isAlive();
        Mythread1 t1=new Mythread1();
        Thread t2=new Thread(t1);
        t2.start();
        int i=1;
        while (i<=50){
            System.out.println("word");
            i++;
        }
    }
}
