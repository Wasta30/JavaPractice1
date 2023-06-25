package day21;

public class MinimumNumber {


    public static void main(String[] args) {

        int[] numbers = {30,10,20,30,40,50};
         int min = numbers[0];

        for (int each : numbers) {
            if(each<min){// if each is lower than the cureent minimum to
                min = each ;// then min will become each

            }
        }


        System.out.println(min);




    }





}
