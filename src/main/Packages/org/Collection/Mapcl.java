package org.Collection;

import java.util.*;

public class Mapcl {
    public static void main(String[] args) {
        Map<String, Integer> hm=
                new HashMap();

        Map<String, String> hm1=
                new HashMap();

        Map<String, Integer> hm2
                = new HashMap();

        hm.put("id",12);
        hm.put("id1",13);
        hm.put("id2",14);
        hm.put("id3",15);
        hm1.put("fName","Ravi");
        hm1.put("fName1","mahesh");
        hm1.put("fName2","mohan");
        hm1.put("fName3","suraj");
        hm2.put("mob",23312232);
        hm2.put("mob1",232555532);
        hm2.put("mob2",999999);
        hm2.put("mob3",55555555);

        ArrayList as=new ArrayList();
        as.add(hm);
        as.add(hm1);
        as.add(hm2);
        for(Object nh:as){
            System.out.println(nh);
        }



    }
}
