package day20_Arrays;

public class  FindingTheMaxNumOFArray {

    public static void main(String[] args) {


        // so here we will assume that the first element is the max number
        // and compare it will all the numbers , if its greater i will replace i will compare the next element


        int[] numbers = {10, 5, 4, 20, 1, 0};
        int max = numbers[0];

        // shortcut for array when using loop , array.fori (means array ka jo name wo likho and fori krdou
//  so it will automatically give u the beg and end of the array

        for (int i = 0; i < numbers.length; i++) {
            // if cond become true 10 will replace by 20
            if (numbers[i] > max) {// if there is element in the array thats greater than the current maximum number
                max =numbers[i]; //so under this cond the we will get the maximum number

            }


            // and if u want to do it for last index call array numbers.forr (r stand for reverse)

            //  for (int i = numbers.length - 1; i >= 0; i--) {

        }
        System.out.println(max); // make sure to print varaibble is not inside loop

    }


}
/*

 */