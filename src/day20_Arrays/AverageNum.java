package day20_Arrays;



public class AverageNum {


    public static void main(String[] args) {
int [] numbers = {10,20,30,40,50,60};
//suppose i have to find the avg of these num , so for that i need the sum of these number
       double sum = 0; // in order to get decimal also

        for (int i = 0; i < numbers.length; i++) {

            sum+=numbers[i];

        }

     double avgNum = sum/numbers.length;

        System.out.println(avgNum);



    }


}
/*
4. AverageNumber:
			1. Ask the user how many numbers they want to enter
			2. get all the inputs from the user and store them into an array
			3. Iterate the array & return the average number

 */