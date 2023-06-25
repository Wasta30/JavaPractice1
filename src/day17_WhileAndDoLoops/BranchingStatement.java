package day17_WhileAndDoLoops;

public class BranchingStatement {

    public static void main(String[] args) {


        // used for exiting the switch
        // this also has another funtion means exit the loops , otherwise the loops will only stop when the conditon becomes false
// using break statemenr forcefully tellng loop to stop

        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i+" ");
            if (i=='F'){
                break;// exits the loop
            }
          // if u give f before print i will only print till 'E'
        }
// if u place the  if statement after print system it will include F also

        System.out.println();
        System.out.println("------------------------");





    }



}
