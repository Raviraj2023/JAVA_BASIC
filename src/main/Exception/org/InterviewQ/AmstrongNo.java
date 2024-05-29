package org.InterviewQ;

import java.util.Scanner;

public class AmstrongNo {
    public static void main(String[] args) {
        int r,m,n,sum=0;
        Scanner sd=new Scanner(System.in);
        n=sd.nextInt();

        m=n;
        while(n>0){
            r=n%10;
            n=n/10;
            sum=sum+r*r*r ;
        }
        System.out.println(sum);
    }
}
