package Day38_Inheritance.carTask;

public class Toyota extends Car {

    public Toyota( String model, int year, double price, String color, int miles) {
        super("Toyota", model, year, price, color, miles);
    }



public void reliabile(){
    System.out.println(brand+" "+model+" is reliabile");
}


public void start(){

    System.out.println("Twist the key to ignition to start "+ brand+" "+model);
}


}
