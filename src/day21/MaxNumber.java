package day21;

public class MaxNumber {


    public static void main(String[] args) {

        int[] numbers = {10,20,30,40};
        int max =numbers[0];


        for (int each : numbers){
            if(each > max){
                max = each;
            }
        }


        System.out.println(max);


int z = 5;
        for (int i = 5; i < 0 ; i--) {
            z +=i;
        }
        System.out.println(z);
    }


}
