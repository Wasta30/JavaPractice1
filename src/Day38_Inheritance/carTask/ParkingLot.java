package Day38_Inheritance.carTask;

public class ParkingLot {


    public static void main(String[] args) {
        // this show parking lot Has a relation with toyota tesla bmw
        Toyota toyota = new Toyota("Camry",2020,20000,"Gray",123456);
        Tesla tesla = new Tesla("Model S",2022,94900,"White",0);
        BMW bmw = new BMW("X5",2020,156479,"Black",28375459);

        //
        toyota.start();
        tesla.start();
        bmw.start();



    }








}
