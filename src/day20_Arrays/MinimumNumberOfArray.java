package day20_Arrays;

public class MinimumNumberOfArray {


    public static void main(String[] args) {


        int [] numbers = {10,5,6,4,-70};
        int min = numbers[0]; // 10


        for (int i = 0; i < numbers.length; i++) {// i : 0,1,2,3,4
            if(numbers[i]<min){ // compare all number with current num
                min =numbers[i];

            }
        }

        System.out.println(min);


    }




}
