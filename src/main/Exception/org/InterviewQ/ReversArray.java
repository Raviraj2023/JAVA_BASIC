package org.InterviewQ;

public class ReversArray {
    public static void main(String[] args) {
//        int array revers
        int e[]={1,2,3,4,};
        for(int i=0; i<e.length;i++) {
            System.out.print(e[i]);
        }
        System.out.print("\n");
        for(int j=e.length-1;j>=0;j--){
            System.out.print(e[j]);
        }
        System.out.print("\n");

//        char array revers
        char r[]={'R','A','V','I'};
        System.out.println(r);
        for(int i=r.length-1;i>=0;i--){
            System.out.print(r[i]);
        }
        System.out.println();
//       String array revers 1
        String str="Raviraj", str1="Bhosale",
                rstr="";
        char h;
        for(int i=0; i<str.length();i++){
            h=str.charAt(i);
            rstr=h+rstr;
        }
        System.out.println(rstr);
//        String revers using tochararray()
        char[] f=str1.toCharArray();
        for(int i=f.length-1; i>=0;i--){
            System.out.print(f[i]);
        }
        System.out.println();
//        String revers using string builder
        String str2="Hello";
        StringBuilder build=new StringBuilder();
        build.append(str2);
        build.reverse();
        System.out.println(build);
//          How to encrypt string and print in regular form
        String str3="RAVIRAJ";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str3.length();i++){
            sb.append(""+(char)((str3.charAt(i)+i)));
        }
        System.out.println(sb.toString());
//       How to encrypt string and print in reverse form
        String str4="RAVIRAJ";
        StringBuilder sb1=new StringBuilder();
        for(int i=str4.length()-1;i>=0;i--){
            sb1.append(""+(char)((str4.charAt(i)+i)));
        }
        System.out.println(sb1.toString());
    }
}
