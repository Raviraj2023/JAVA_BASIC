package org.Multithreading;

class Mydem extends Thread {
    int w[]={67,87,768,787,888};
    public void run(){
            for(int x:w){
        System.out.println(x);
    }
    }
}
public class Threadss {
    public static void main(String[] args) {
        Mydem ty=new Mydem();
        ty.setDaemon(true);
        ty.start();
        System.out.println("sdgdfsexs");
        try{
        Thread.sleep(100);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
