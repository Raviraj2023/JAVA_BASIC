package org.oops.inharitance;

public class Child extends Father{
    public Child(String flat, String home, String scooty, String car,String house) {
        super.Car=car;
        super.setFlat("5BHK");
        super.Home=house;
        Flat = flat;
        Home = home;
        Scooty = scooty;
    }

    String Flat;
    String Home;
    String Scooty;

    void Rchild(){
        System.out.println("CBike: "+Scooty);
    }
    void Mchild(){
        System.out.println("Cflat: "+Flat);
    }
    void Schild(){
        System.out.println("Chome: "+Home);
    }
    void display(){
        System.out.println("child");
    }
}
