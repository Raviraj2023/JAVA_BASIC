package org.oops.Abstraction;

public class Car extends Engine{

    @Override
    void engineStop(int x, int y) {
        System.out.println("Engine Stop");
    }

    void carOpen(){
        System.out.println("car open");
    }

}
