package day40_FinalKeyword;

public class FinalVariable {

   final char gender; // this is the instance variable and eveerytime u set instance variable final u will get compiler error if u dont initalize it
    // and we need to set it by using constructor
    final String birthday;

    final static String name ; // when static variable is final we have to intialize befpre (by the time we use it)
    // how do we use static variable , instance we call it through obj and static we call it by cllass name and by th time i call it through the class name it must be set

    static{
        name = "Batch EU10"; // so we set the static varaible which is also final
    }

    public FinalVariable(char gender, String birthday) {
        this.gender = gender;
        this.birthday = birthday;
    }

    public static void main(String[] args) {

        // these are the local variable
       final double pi = 3.14; // i want to stay it as constant
        // if its final value no other vallue can replavce and if we tried cahnging we get compile error


        final String name ; // i can only initalize one time

        name = "java";

     //   name = "woodenspoon"; compiler error as cant be reassigned


        System.out.println(name);


        System.out.println("-------------------");

        FinalVariable obj = new FinalVariable('F',"Jan/30");


      //  obj.birthday= "June/26"; // can not be reaasign as its a final



        System.out.println(obj.birthday);


       // FinalVariable.name = "Wasta"; can change static varaibel as its final
      //  static doesnt mean its unchange but final means unchangeable


        System.out.println(FinalVariable.name);// call the static varaible from class name



    }






}
