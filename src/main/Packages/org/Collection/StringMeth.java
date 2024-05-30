package org.Collection;

import java.util.Locale;

public class StringMeth {

    public static void main(String[] args) {
        String str="   Raviraj   wee  ";
        String Str1="Raviraj";
        String Str2=new String("raviraj");
//        System.out.println(str==Str2);
//        System.out.println(str.contains("A"));
//        System.out.print(str.equals(Str1));
//        System.out.println(str.length());
//        System.out.println(str.toLowerCase(Locale.ROOT));
//        System.out.println(str.toLowerCase());
//        System.out.println(str.toUpperCase());
//        System.out.println(str.charAt(3));
//        System.out.println(str.concat(Str2));
//        System.out.println(str.endsWith("rao"));
//        String re=str.substring(2,4);
        String qw=str.trim();
//        System.out.println(str.replaceFirst("a","W"));
        System.out.println(qw.isEmpty());
    }
}
