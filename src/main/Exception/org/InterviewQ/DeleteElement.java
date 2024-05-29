package org.InterviewQ;

public class DeleteElement {
    public static void main(String[] args) {
        int[]A=new int[10];
        int x=21;
        int n=8,index=2;
        A[0]=12;
        A[1]=13;
        A[2]=14;
        A[3]=15;
        A[4]=16;
        for(int i=n;i>index-1;i--){
            A[index]=A[i];
        }
        for(int b:A){
            System.out.print(b+",");
        }
    }
}
