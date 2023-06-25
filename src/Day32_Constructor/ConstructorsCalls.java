package Day32_Constructor;

public class ConstructorsCalls {

    public ConstructorsCalls(){
        // i can not do this , can call constructor itself :this();
        System.out.println("Default constructor");
    }



    public ConstructorsCalls(int a ){
        this();// default constructor
        // this is the first constructor (default constructor and i can not call it by its name)
        System.out.println("Constructor with int argument");
    }


   public ConstructorsCalls(String str){
     /*   this();
        this(10);*/
       // i can only call one contrustor either default or teh seconnd one
       this(9);// int constructor
       System.out.println("Constructor with String argument");
   }


    public static void main(String[] args) {
        ConstructorsCalls obj1 = new ConstructorsCalls();// output default contructor
        System.out.println("------------------");
        ConstructorsCalls obj2 = new ConstructorsCalls(10);// default const and also int
        System.out.println("--------------------");

        ConstructorsCalls obj3 = new ConstructorsCalls("Wasta");
// deafult , then int and then string argument
    }

}
