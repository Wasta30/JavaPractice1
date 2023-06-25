package day37_Inheritance.phoneTask;

public final class Iphone extends Phone{ // we amke this class final and cant be inherited
// must for the sub class to call constructor from parent
    public Iphone( String model, String size, double price, String color) {
        super("Apple", model, size, price, color);
    }




    public void faceTime(long phoneNumber){
        System.out.println(brand+" "+model+" is having a Facetime");
    }

public void faceTime(String email){
    System.out.println(brand+" "+model+" is having a Facetime");
}

}

