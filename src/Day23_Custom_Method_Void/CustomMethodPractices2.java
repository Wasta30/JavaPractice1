package Day23_Custom_Method_Void;

public class CustomMethodPractices2 {


    public static void main(String[] args) {
        System.out.println("Test started");
        System.out.println();
        helloWorld5times();
        System.out.println("-------------");
        HelloCydeo5Times();
        System.out.println();
        EvenNumbers();
        System.out.println("Test Ended");
    }
    // create a function that can print hello world 5 times

    public  static void helloWorld5times(){

        for (int i = 0; i <5 ; i++) {
            System.out.println("Hello word");
        }


    }


    // create a function that can print hello cydeo 5 times

    public static void HelloCydeo5Times(){
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Hello Cydeo");
        }
    }


// create a function that can print all the even number from 1 to 10
    public  static void EvenNumbers(){
        for (int i = 2; i <11  ; i+=2) {
            System.out.println(i);
        }
    }


}
// if method has no paramter means no additonal info needed
// for exm we need to check if num is odd or even first check the num