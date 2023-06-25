package day41_Exception;

public class FinallyBlock {

    public static void main(String[] args) {
        // finally block will always executed

        int[] arr = {1,2,3};

        try{
            System.out.println("Try block");
            System.out.println(arr[100]);
        }catch (RuntimeException e){
            System.out.println("Catch block");
            e.printStackTrace();
           // System.exit(0);
        }finally {
            System.out.println("Finally block");
        }






    }




}
