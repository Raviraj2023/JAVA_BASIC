package org.Collection;

import java.sql.SQLOutput;

public class Basic {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int b[]=new int[3];
        b[2]=21;
        b[1]=22;
        b[0]=11;

        int c[]=new int[12];
        for(int i=0; i>b.length;i++){
           c[i]=b[i];
        }
        c=b;
        c[4]=22;
        System.out.println(c[1]);
    }
}
