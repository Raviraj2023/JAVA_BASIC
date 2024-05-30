package org.oops.Abstraction;

abstract class Engine extends Gearbox{
    void engineStart(){
        System.out.println("Engine started");
    }
    abstract void engineStop(int a, int b);

    void gearenaged(){
        System.out.println("gear engaged");
    };
}
