package org.InterviewQ;

import java.util.Scanner;

public class ReversNo {
    public static void main(String[] args) {
        int n,r, rev=0;
        Scanner sd=new Scanner(System.in);
            n=sd.nextInt();
        while(n>0){
            r=n%10;
            rev=(rev*10)+r;
            n=n/10;
        } System.out.println(rev);
    }
}
