package org.oops.Abstraction;

public class Variable {
    int x;
    {
        x=10;
    }

    public static void main(String[] args) {
        Variable nr=new Variable();
        System.out.println(nr.x);
        int y=1;
        y+=(y=4)*(y+1);
        System.out.println("y="+y);
    }
}
