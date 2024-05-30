package org.InterviewQ;

public class CopyArray {
    public static void main(String[] args) {
        int A[]={12,32,43,43,23,12};
        int B[]=new int[10];
        for(int i=0;i<A.length; i++){
            B[i]=A[i];
        }
        for(int x:B){
            System.out.print(x+",");
        }
    }
}
