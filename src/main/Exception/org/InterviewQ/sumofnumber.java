package org.InterviewQ;

import java.util.Scanner;

public class sumofnumber {
    public static void main(String[] args) {
        int n;
        int sum=0;
        Scanner sd=new Scanner(System.in);
        System.out.println("Enter number");
        n=sd.nextInt();
        int i=0;
        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);

//        for(int i=0; i<=n;i++){
//           sum=sum+i;
//            }System.out.println(sum);
    }
}
