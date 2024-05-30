package org.Exception;

import java.awt.geom.Area;
import java.util.Scanner;

class NegativeDimensionsException extends Exception
{
// User defined Exception handler
//    Type 1
//    public org.Exception.NegativeDimensionsException (String message){
//        super(message);
//    }
    // Type 2
    public String toString(){
        return ("Negative no. not Allowed");
    }
}

public class Day3 {
//   Throw vs Throws
static String message="userno";
     int area(int l, int b)throws NegativeDimensionsException {

         if (l < 0 || b < 0)

             throw new NegativeDimensionsException ();
        int Area = 0;
         Area = l / b;
         System.out.println(Area);

       return Area;
    }
     void outPut(int l,int b)throws NegativeDimensionsException
    {
        System.out.println("area is :"+ area(l,b));
    }
    void asad() throws NegativeDimensionsException{
        System.out.println("ds");
    }
public static void main(String[] args) throws NegativeDimensionsException
{
    int l,b;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter 2 no.: ");
    l=sc.nextInt();
    b=sc.nextInt();

    Day3 dd=new Day3();
        dd.outPut(l,b);
//        dd.area(l,b);
        dd.asad();
}
}
