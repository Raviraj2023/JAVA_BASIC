package org.Multithreading;


class myrun implements Runnable{
    public void run(){
        int i=1;
        while (i<=20) {
            System.out.println("hello");
            try {
                Thread.sleep(10);
            }
            catch (Exception e){
                System.out.println(e);
            }
            i++;
        }
    }
}
class MyTread extends Thread{
    public MyTread(String name){
        super(name);
//        System.out.println("werdsd");
        setPriority(Thread.MIN_PRIORITY);
        try {
            Thread.sleep(20);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
public class Threadcla {
    public static void main(String[] args) {
        Thread tr=new Thread(new myrun(),"my thread");
        tr.start();
        int i=1;
        while (i<=20) {
            System.out.println("world");
            i++;
        }
        MyTread tr1=new MyTread("Ravi");
        tr1.start();
        tr.interrupt();
        System.out.println(tr1.getName());
        System.out.println(tr1.getPriority());
        System.out.println(tr.getPriority());
        System.out.println(tr1.getId());
        System.out.println(tr.getName());
        System.out.println(tr1.getState());

    }
}
