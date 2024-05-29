package org.oops.Abstraction;
abstract class Supe {
    void meth1(){

    }
    abstract void meth2();

        }class sub extends Supe{

    public void meth2(){
        System.out.println("submeth");
    }
        }
 class Absta {
    public static void main(String[] args) {
        Supe sd=new sub();
        sd.meth2();
    }
}
