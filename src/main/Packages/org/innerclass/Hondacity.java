package org.innerclass;

import javax.sound.midi.Soundbank;

public class Hondacity {
    static int price=100;
     int quantity;
   static double onRoadPrice(String City){
        switch(City){
            case "PUNE":return price+price*2;
               case "Mumbai":return price+price*4;
            case "Delhi":return price+price*3;
                case "Goa":return price+price*6;
            default:return price;
        }
    }
   int noOfCar(int no){
       System.out.println("car");
this.quantity=no;
       System.out.println(quantity);
       return quantity;
    }
}
 class MMain{
    public static void main(String[] args) {
        Hondacity H1=new Hondacity();
        System.out.println(Hondacity.onRoadPrice("PUNE"));
        H1.noOfCar(88);
    }
}
