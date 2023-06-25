package day21;

public class AverageNumbers {


    public static void main(String[] args) {

        int [] numbers = {10,20,30,40,50,60};
        double sum = 0; // need eveyr single element and add ir to sum


        for (int each : numbers) {
            sum += each;
        }

        double average = sum/numbers.length;
        System.out.println("Average = "+ average );










    }




}
