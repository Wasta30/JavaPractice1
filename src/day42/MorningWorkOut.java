package day42;

public class MorningWorkOut {

    public static void main(String[] args) {

        System.out.println("----------Push up started-----");
       // do 30 push upp and try pausing 1.5 seconds in each
        for (int i = 1; i <= 30 ; i++) {

            System.out.println("\rPush up"+i);

            sleep(1.5);

        }

        System.out.println("Push up completed");


        System.out.println("------Pull up started----");


        for (int i = 1; i <=20 ; i++) {


            System.out.println("\rPull up"+i);

            sleep(2.5);



        }

        System.out.println("Pull up completed");

    }


    //                      2.5
    public static void sleep(double seconds){
//
        try{
            Thread.sleep((long) (seconds*1000));
        }catch (InterruptedException e){
            e.printStackTrace();
        }


    }



}
/*
do 30 push upp and try pausing 1.5 seconds in each

do 20 pull up and try pausing 2.5 seconds in each

 */