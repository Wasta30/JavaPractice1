package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class Car_Objects {

    public static void main(String[] args) {

         // object of the class store it into variable
        Car car1 = new Car();
        car1.setInfo("Toyota","Camry","White",2021,35000);
        System.out.println("car1 = " + car1);



        Car car2 = new Car();
        car2.setInfo("Carolla","XYZ","Black",2019,3000);
        System.out.println("car2 = " + car2);

        
        
        Car car3 = new Car();
        car3.setInfo("BMW","331ws","White",2018,4000);

        System.out.println("car3 = " + car3);


        // how to put them in one place ?
        // we can use data structure Array or ArrayList



     //   Car[] cars= {car1,car2,car3}; its better to use array list

        ArrayList<Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(car1,car2,car3));

        // find which car is most expensive
        // or can i get brand
        // for this we need loop ( need to iterate the array)

        // if u just need to know brand , or price , each represnr car
        for(Car each : carsList){
            System.out.println(each.brand+" : "+each.price);
        }

        System.out.println("----------------------");
// suppose arraylist contaain hundred of cars how u will find car which is eligible for reca;ll
        // BMW : 2005-2008
        // toyata : 1995-1997 these are eligible for recall
        // how  write a program to remove these car from array list
        // use remove IF method

        carsList.removeIf(p->p.brand.equals("BMW") && p.year>=2005 && p.year<=2008);
        carsList.removeIf(p->p.brand.equals("Toyota") && p.year>=1995 && p.year<=2007);






    }



}
