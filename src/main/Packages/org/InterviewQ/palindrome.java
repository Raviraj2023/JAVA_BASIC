package org.InterviewQ;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        int n,r,m,rev=0;
        Scanner sd=new Scanner(System.in);
        n=sd.nextInt();
        m=n;
        while(n>0){
            r=n%10;
            rev=(rev*10)+r;
            n=n/10;
        }if(rev==m){
            System.out.println("No. is Palindrome");
        }else{
            System.out.println("No. is not Palindrome");
        }
    }
}
