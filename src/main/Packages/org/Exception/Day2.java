package org.Exception;

public class Day2 {
    //        Nested Try_Catch Block
    public static void main(String[] args) {
int q[]={12,34,56,54,32,0};
try {
    int r=q[2]/q[5];
    System.out.println(r);

    try {
        System.out.println(q[1]);
    }catch (ArrayIndexOutOfBoundsException e1){
        System.out.println("Entered Array length is larger");
    }

}catch (ArithmeticException e){
    System.out.println("Diviser should not be Zero");
}finally {
    System.out.println("Good to GO");
}

    }
}
