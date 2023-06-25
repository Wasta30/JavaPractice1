package day43_Abstraction.CarTask;

public class CarShop {


    public static void main(String[] args) {

        // we can not create object from abstract class

      //  Car car1 = new Car("Cydeo","25","Blue",2022,10000)


    Honda honda = new Honda("Accord","Black",2019,30000);

     Audi audi = new Audi("Q7","Red",2020,45000);

     Tesla tesla = new Tesla("Model13","White",2021,60000);


        System.out.println(honda);
        System.out.println(tesla);
        System.out.println(audi);


        System.out.println("-------------------");


        honda.setColor("Red");
        audi.setColor("Pink");
        tesla.setColor("White");

        honda.setPrice(25000);
        tesla.setPrice(40000);
        audi.setPrice(55000);


        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);




    }





}
