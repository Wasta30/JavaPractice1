package day17_WhileAndDoLoops;

public class LoopPractices {

    public static void main(String[] args) {


        // suppose ask u to repeat 1 to 10 so use for loop as u know the repition
        //
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i);
        }

        // i can also choose while loop to solve this task
        System.out.println("----------------------");

        int num = 1;

        while (num<=10){
            // num++; if i put num first before print statement it will start printing from 2 to 10 thats the disadvantage of dowhileloop
           // so its not the best practice to use while loop for this
            System.out.println(num);
            num++;
        }


        System.out.println("----------------------------");


        int num2 = 1; // give iteration after statement
        do {
            System.out.println(num2);
            num2++;
        }while (num2<=10);


        // ppt pg 6
    }





}
