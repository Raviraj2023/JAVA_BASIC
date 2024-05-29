package org.InterviewQ;

import java.util.Scanner;

public class mult_table {
    public static void main(String[] args) {
        int n,i=1;
        Scanner number=new Scanner(System.in);
        System.out.println("enter number");
        n=number.nextByte();
//        for(; i<=10;i++){
//            System.out.println(n*i);
//        }

        while(i<=10){
            System.out.println(n*i);
            i++;
        }
    }
}
