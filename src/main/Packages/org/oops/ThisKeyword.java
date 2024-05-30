package org.oops;

public class ThisKeyword {
    public ThisKeyword(int length, int weadth) {
        this.length = length;
        this.weadth = weadth;
    }
    void display(){
        System.out.println("Length: "+this.length);
        System.out.println("Weadth: "+this.weadth);
    }

    int length;
    int weadth;

    public static void main(String[] args) {
        ThisKeyword th=new ThisKeyword(12,23);
        th.display();
    }
}
