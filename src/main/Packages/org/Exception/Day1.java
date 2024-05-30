package org.Exception;

import java.util.Scanner;

public class Day1 {

//    Simple Try_catch Block
    public static void main(String[] args) {
        int a,b,c,d;
        Scanner sce=new Scanner(System.in);
        System.out.println("Pls enter 2 numbers");
        a=sce.nextInt();
        b=sce.nextInt();
       try {
           c=a/b;
           System.out.println(c);
       }catch (ArithmeticException e){
           System.out.println("deviser should not be zero");
       } System.out.println("Good");

       int w[]={12,32,45,56,78,0};
       try {
           d=w[2]/w[4];
           System.out.println(d);
           System.out.println(w[10]);
       }catch (ArithmeticException e1){
           System.out.println("Deviser should not be zero");
       }catch (ArrayIndexOutOfBoundsException e2){
           System.out.println("Invalid Aarray length");
       }finally {
           System.out.println("We are good with Try_catch Block");
       }
    }


}
