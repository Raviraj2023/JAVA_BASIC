package org.oops.inharitance;


public class Distribution {

    public static void main(String[] args) {
        Child Ravi=new Child("1BHK","No","Activa", "Ferari","tara");
        Child Mohan=new Child("2BHK","Yes2","Activa6G", "i10","mohan");
Father fr=new Child("2BHK","Yes2","Activa6G", "i10","mohan");
fr.Gradfather();
fr.display();
fr.Rfather();
fr.Mfather();

//        Child Suman=new Child();
//        System.out.println("Ravi Property: ");
//        Ravi.Rfather();
//        Ravi.Rchild();
//
     System.out.println("Mohan Property: ");
        Mohan.Mfather();
        Mohan.Mchild();
}
}
