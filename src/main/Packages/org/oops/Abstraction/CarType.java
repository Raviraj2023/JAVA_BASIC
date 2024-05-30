package org.oops.Abstraction;

public class CarType{
    public static void main(String[] args) {
        Engine lambo=new Car();

//        lambo.carOpen();
        lambo.engineStart();
        lambo.gearenaged();
        lambo.gearreleased();
        lambo.engineStop(12,33);
    }


}
