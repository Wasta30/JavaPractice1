package day41_Exception;

import day39_Recap.cydeoTask.Employee;

public class MultiCatchBlock {

    public static void main(String[] args) {


        Employee employee = null;

        // u can not put run time exception above any of its sub exception


        try{

            System.out.println(employee.getSalary());


        }catch(NullPointerException e){ // null pointer exception
            System.out.println("First catch block");
            e.printStackTrace();


        }catch (IndexOutOfBoundsException e){

            System.out.println("Second catch block");
            e.printStackTrace();

        }catch(ArithmeticException e){
            System.out.println("Third catch block");
            e.printStackTrace();


        }catch(ClassCastException e){
            System.out.println("fourth catch block");
            e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println("fifth catch block");
            e.printStackTrace();
        }

        System.out.println("Test completed");


        System.out.println("-------------------");

// if u dont know the type of uncheck error give runtimeexception
        try{
            System.out.println("java".charAt(-1)); //java.lang.StringIndexOutOfBoundsException: String index out of range: -1
        }catch (RuntimeException e){
            e.printStackTrace();
        }







    }





}
