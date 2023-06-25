package Day25_CustomMethod_OverLoading;

import java.util.Arrays;

public class MethodOverloadingIntro {


    // allow us to have same method name when we have same fucntionality like previous task of sumofnumbers
    // there is one cond : parametrs must be different ,either data type or number of parameter
    // same method name diff parameters
    // improve the reusuebility and easier to remember

    // sort is a method overloadinf we have diff datatype for sort for btte int float
    // in order to sort double array need to  call sort(double) , for int array sort(int), and we just give one method name which is sort
    public static void main(String[] args){


    int[] intArray = {1, -2, 0, 3, 2, 4, 5, 7, 6};
        Arrays.sort(intArray);

    char[] charArray = {'C', 'D', 'A', 'B'};
        Arrays.sort(charArray);

    double[] doubleArray = {2.3, 1.2, 1.1, 0.0};
        Arrays.sort(doubleArray);

        System.out.println("---------------------");
        // now when i call sumofNumbers i get many options
        // sum of 10 and 20
       int num1= sumOfNumbers(10,20);// which method gets executed ? // it depends on the parameter u gave
        System.out.println(num1);
        int num2= sumOfNumbers(10,20,30);
        System.out.println(num2);
// sum of 1.1,2.5
        double num3=  sumOfNumbers(1.1,2.5);
        System.out.println(num3);
// sum of 5.5,6.5,7.7

      double num4=  sumOfNumbers(5.5,6.5,7.7);
        System.out.println("num4 = " + num4);





}
// all have same fucntionality so we can give same method name
    public static int sumOfNumbers(int num1 , int num2){
        return num1+num2;
    }
    public static double sumOfNumbers(double num1 , double num2){
        return num1+num2;// 2 decimal
    }// i can also use decimal and overload it
        public static int sumOfNumbers (int num1,int num2, int num3){
            return num1+num2+num3;
        }

    public static double sumOfNumbers(double num1 , double num2,double num3){
        return num1+num2+num3;}// 3 decimal num

    // for 4 decimal
    public static double sumOfNumbers(double num1 , double num2,double num3,double num4){
        return sumOfNumbers(num1,num2,num3)+num4;}

    public static int  sumOfNumbers (int num1 , int num2, int num3, int num4){
        return  sumOfNumbers(num1,num2,num3)+num4;
    }




}





