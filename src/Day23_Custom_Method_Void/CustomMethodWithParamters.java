package Day23_Custom_Method_Void;

public class CustomMethodWithParamters {

    public static void main(String[] args) {
        OddOREven(8);// u have to put number here
//must provide argument (means what u are passing)
        // this argument assign it to variable num
        AgeOfAPerson(1997);
    }
    public static void OddOREven(int num){ // it can be any integer
// if data type is int (put integaers num in argument) in main class
        if(num%2==0){
            System.out.println(num +" is even number");
        }else {
            System.out.println(num+" is odd number");
        }

    }



// display age of the Person , so need birth year to calculate age

    public static void AgeOfAPerson(int birthYear){
        int age = 2022 -birthYear;
        System.out.println("Your age is:"+ age);
    }


}
