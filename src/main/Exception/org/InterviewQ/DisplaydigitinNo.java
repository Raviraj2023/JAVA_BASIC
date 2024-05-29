package org.InterviewQ;

import java.util.Scanner;

public class DisplaydigitinNo {
    public static void main(String[] args) {
        int n, r;
        Scanner sd=new Scanner(System.in);
        n=sd.nextInt();
        while(n>0){
           r=n%10;
            n=n/10;
            System.out.println(r);
        }
    }
}
