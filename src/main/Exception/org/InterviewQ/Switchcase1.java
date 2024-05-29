package org.InterviewQ;

import java.util.Scanner;

public class Switchcase1 {
    public static void main(String[] args) {
        int x,y,z;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 numbers");
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println("Enter Method type ADD/SUB/MULT/DIV/AVARAGE");
        String MethodType=sc.next();
        MethodType=MethodType.toUpperCase();

        switch (MethodType){
            case "ADD" :
                z=x+y;
                System.out.println("Addition of 2 numbers:\n"+z);
            break;
            case "SUB" :
                z=x-y;
                System.out.println("Substraction of 2 numbers:\n"+z);
                break;
            case "MULTI" :
                z=x*y;
                System.out.println("Multiplication of 2 numbers:\n"+z);
                break;
            case "DIVI" :
                z=x/y;
                System.out.println("Division of 2 numbers:\n"+z);
                break;
            case "AVAR" :
                z=(x+y)/2;
                System.out.println("Division of 2 numbers:\n"+z);
                break;
            default:
                System.out.println("invalid method");
        }
    }
}
