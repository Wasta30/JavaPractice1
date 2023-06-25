package Day27_WrapperClasses;

public class WrapperClassIntro {

    public static void main(String[] args) {


        int num =200;

        // primitive to wrapper class : Autoboxing

        Integer n1 = num;

        //Wrapper class object to pritimive : Unboxing
        int num2 =n1;

        System.out.println("----------");

        Integer integerValue =100;
        // so u can convert object to any primitive type(with in range)
        // but can not convert pritimive to any classs
        // pritimive is loyal to its own class
        long longValue = integerValue;

        Byte b1 =23;

        int a1 = b1;
        long a2 =b1;
        short a3 = b1;
        double a4 = b1;
        System.out.println("--------------");



        int num3 =300;
  // not possible to convert it to Long
        //Long num4 =num3;

        Integer num5 = num3;//autoboxing

        System.out.println("---------");
        // we can convert class into class but this neither autoboxing nor unboxing

        Integer z = 900;
        Integer y = z;

        System.out.println("-----------");

        int [] numbers1 = {1,2,3,4,5};
        Integer [] numbers = {1,2,3,4,5};






    }






}
