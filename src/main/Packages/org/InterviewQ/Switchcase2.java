package org.InterviewQ;

import java.util.Scanner;

public class Switchcase2 {
   private int x,y,z;
    String type;
    public String gettype(){
        return type;
    }
    public void setType(String type){
        this.type=type;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int ADD(int x,int y){
        z=x+y;
        return z;
    }
    public int SUB(int x,int y){
        z=x-y;
        System.out.print("Substraction of 2 No:");
       return z;
    }
    public int MULT(int x,int y){
        z=x*y;
        return z;
    }
    public int DIV(int x,int y){
        z=x/y;
        return z;
    }
    public int AVAR(int x,int y){
        z=(x+y)/2;
        return z;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Switchcase2 sw=new Switchcase2();
        System.out.print("enter x:\n");
        sw.setX(sc.nextInt());
        System.out.print("enter y:\n");
        sw.setY(sc.nextInt());
        System.out.print("enter Method Type:\n");
        sw.setType(sc.next());
        int a=sw.getX();
        int b=sw.getY();

        switch (sw.gettype().toUpperCase()){
            case "ADD":
                System.out.println(sw.ADD(a,b));
                break;
            case "SUB":
                System.out.println(sw.SUB(a,b));
                break;
            case "MULT":
                System.out.println(sw.MULT(a,b));
                break;
            case "DIV":
                System.out.println(sw.DIV(a,b));
                break;
            case "AVAR":
                System.out.println(sw.AVAR(a,b));
                break;
            default:
                System.out.println("invalid");
        }
    }
}
