package org.InterviewQ;

public class RotationArray {
    public static void main(String[] args) {
        int A[]={12,32,21,33,43,22,34,32,34};
        System.out.print("{");
        for(int x:A){
            System.out.print(x+",");
        }
        System.out.println("}");
        int temp=A[0];
        for(int i=1; i<A.length;i++){
            A[i-1]=A[i];
        }
        A[A.length-1]=temp;
        for(int x:A){
            System.out.print(x+",");
        }
    }
}
