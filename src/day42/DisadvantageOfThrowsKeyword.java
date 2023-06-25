package day42;

public class DisadvantageOfThrowsKeyword {

    public static void main(String[] args) {

        // throw keyword is a temporary solution , we have to call it everytime we call the method , try and catch block is the permenant solution


        System.out.println("Hello");
      //  sleep(2.5); // have to use throws keyword again

        System.out.println("Hello world");

        System.out.println("--------------");


        System.out.println("Hello");

        MorningWorkOut.sleep(2.5); // try catch blocjk and no compile exception occur


        System.out.println("Cydeo");

    }



    public static void sleep(double seconds) throws InterruptedException {

        Thread.sleep((long) (seconds*1000));


    }


}
