package org.oops.inharitance;

public class Father extends GrandFather{
    public void setFlat(String flat) {
        this.FFlat = flat;
    }
    public String getFFlat() {
        return FFlat;
    }
    private String FFlat;

    public void setHome(String home) {
        Home = home;
    }

    public void setCar(String car) {
        Car = car;
    }

    String Home;
    String Car;
    void Rfather(){
        System.out.println("Fflat: "+getFFlat());
        System.out.println("Fhome: "+Home);
        System.out.println("Fbike: "+Bike);
    }
    void Mfather(){
        System.out.println("Fhome: "+Home);
        System.out.println("Fcar: "+Car);
        System.out.println("Fbike: "+Bike);
    }
    void Sfather(){
        System.out.println("Fflat: "+getFFlat());
        System.out.println("Fcar: "+Car);
    }

    void display(){
        System.out.println("Father");
    }


}
