package org.Collection;

import java.util.ArrayList;
import java.util.List;

public class AarrayList {
    public static void main(String[] args) {
       ArrayList al1=new ArrayList(20);
     ArrayList<Integer> al2;
        al2 = new ArrayList(List.of(23,44,223,32));

        AarrayList.show(23);
        al1.add(233);
        al1.add(34);
        al1.add(1,543);
        al1.addAll(al2);
        System.out.println(al1.contains(44));
//        System.out.println( al1.indexOf(32));

//        System.out.println(al2.get(2));
// iterator using while loop
//        int i=0;
//        while (i<al1.size()) {
//            System.out.print(al1.get(i));
//            System.out.print(" ");
//            i++;
//        }
//        iterator using for each loop
//        for(Object x:al1) {
//            System.out.print(x+",");
//        }
//        for(
//        ListIterator it=al1.listIterator();
//        it.hasNext();){
//            System.out.println(it.next());
//        }

//        al1.forEach(n-> System.out.println(n));
//
//        al1.forEach(System.out::print);


        al1.forEach(r-> {
            int n = 0;
            show(n);
        });


    }
    static void show(int n){
        if(n>60)
            System.out.println(n);
    }
}
