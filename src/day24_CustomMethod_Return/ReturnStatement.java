package day24_CustomMethod_Return;

public class ReturnStatement {
    public static void main(String[] args) {

        nameOfTheDay(6);


    }

////4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfTheDay(int number){
        String result ="";
        if(number<0 || number>7) {
            System.out.println("Invalid");
            return; // return method can be used in void also but used as an exit
        }

          result= (number==1)?"Monday":(number==2)?"Tues":(number==3)?"Wed":(number==4)?"Thrusday":(number==5)?"Friday":(number==6)?"Saturday":"Sunday";

        System.out.println(result);
        }





    }





