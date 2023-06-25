package Day31_CustomClass_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrdering {

    public static void main(String[] args) {

        // create 100 pizza objects in those pizza size should be small , cheese toppin should be -2 and peppronni topping is 3
        // create 100 pizza objects in those pizza size should be Medium , cheese toppin should be -3 and peppronni topping is -4
        // create 100 pizza objects in those pizza size should be Large, cheese toppin should be -4 and peppronni topping is 5
        // and add it to arrayList pizza



        ArrayList<Pizza> pizzas = new ArrayList<>();


        for (int i = 0; i < 100; i++) {
             Pizza smallPizza = new Pizza('S',2,3);
        Pizza mediumPizza = new Pizza('M',3,4);
        Pizza largePizza = new Pizza('L',4,5);

       pizzas.addAll(Arrays.asList(smallPizza,mediumPizza,largePizza));
        }


        System.out.println("Total number of pizza:"+ pizzas.size());
        double totalPrice =0;

        // cal price of each pizza and then find total price 
        // 300 pizza price added in variable total price 

        for (Pizza pizza : pizzas) {
            totalPrice +=pizza.calcCost();
            
        }
        System.out.println("totalPrice = " + totalPrice);
        
    }




}
