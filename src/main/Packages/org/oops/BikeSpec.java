package org.oops;

public class BikeSpec extends DataP{

    public void DataP(){
        System.out.println( getAccNo2());
        System.out.println(getBalance2());
        System.out.println(getBankCode2());
        System.out.println( getBankName2());
    }
    public BikeSpec(int seat, String name, String tyre, String ring, String fuel, String engine, String color) {
        this.seat = seat;
        Name = name;
        this.tyre = tyre;
        this.ring = ring;
        this.fuel = fuel;
        this.engine = engine;
        this.color = color;
    }
    void Hondabike(){
        System.out.println("Name of Bike: "+ Name);
        System.out.println("Name of Bike: "+ seat);
        System.out.println("Name of Bike: "+ tyre);
        System.out.println("Name of Bike: "+ ring);
        System.out.println("Name of Bike: "+ fuel);
        System.out.println("Name of Bike: "+ engine);
        System.out.println("Name of Bike: "+ color);
    }

    int seat;
    String Name;
    String tyre;
    String ring;
    String fuel;
    String engine;
    String color;


}
