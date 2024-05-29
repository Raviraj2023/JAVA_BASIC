package org.innerclass;

 public class Innerclas {

     public static void main(String[] args) {
         outer ot=new outer();
         ot.ot();
         ot.otMeth();
        outer.inner in1=ot.new inner();
        in1.show();
        outer.inner2.in3();
        outer.inner2 in2=ot.new inner2();
        in2.in2(23);
        outer.inner2.inner2_in2 in22=in2.new inner2_in2();
         in22.in22();

     }

}
 class outer{
    void ot(){
        System.out.println("outer");
    }
     void otMeth(){
            System.out.println("inner");
    }
    class inner{
        void show(){
            System.out.println("display");
        }
    }
    class inner2{
        static int er;
         void in2(int rf){
            this.er=rf;
             System.out.println(er);
        }
        class inner2_in2{
             void in22(){
                 System.out.println("in22");
            }
        }
        static void in3(){
            System.out.println("display in2");
        }
    }

}

