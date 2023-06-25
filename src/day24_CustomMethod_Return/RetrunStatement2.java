package day24_CustomMethod_Return;

public class RetrunStatement2 {

    public static void main(String[] args) {

        nameOfTheMonth(5);


    }


    //3. Create a method that can display the name of the month based on the given number to the method

public static void  nameOfTheMonth(int number){
    String result ="";
    if(number<=0 ||number>12){
        System.out.println("Invalid");
        return;// it will exit
    }

    result = (number==1)?"Jan":(number==2)?"feb":(number==3)?"March":(number==4)?"April":(number==5)?"May":(number==6)?"June":(number==7)?"July":(number==8)?"Aug":(number==9)?"September":(number==10)?"October":(number==11)?"November":"December";

    System.out.println(result);
}






}
