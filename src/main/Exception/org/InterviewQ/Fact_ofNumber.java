package org.InterviewQ;

import java.util.Scanner;

public class Fact_ofNumber {
    public static void main(String[] args) {
        int fact=1,i=1, n;

        Scanner sd=new Scanner(System.in);
        System.out.println("enter no.");

        n=sd.nextInt();
//        for(int i=1; i<=n;i++){
//            fact=fact*i;
//        }System.out.println(fact);

        do{
            fact=fact*i;
            i++;
        }while (i<=n);
        System.out.println(fact);
    }
}
