package Day32_Constructor;

public class CarObjects {

    public static void main(String[] args) {





        Car car1 = new Car("Toyota");

        Car car2 = new Car("Honda","Accord");

        Car car3 = new Car("Lexus","RX@#$",2021);

        Car car4 = new Car("BMW","RX345",2022,25000);

        Car car5 = new Car("Tesla","RX#$^",2019,3000,"White");


        System.out.println("car1 = " + car1);
        System.out.println("car2 = " + car2);
        System.out.println("car3 = " + car3);
        System.out.println("car4 = " + car4);
        System.out.println("car5 = " + car5);// print all attribute


    }



}
