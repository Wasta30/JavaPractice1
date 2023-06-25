package day45_Interface_AbstractionReview;

public interface  PropertiesOfInterface {
    // class can be final but interface can not be final because it has to achieve 100 percent abstraction
    /*
    public final interface  PropertiesOfInterface // it can not be like this
     */
 /*
    in regular vclasses we have static and instance variab;e like
    int a;
    static int a;
  or instance method etc but in interface i can not create instance variable or instance method

instantiiate means : create object
and abstract class can not bbe innstantiated
intializing means setting variable name ,value etc

 */

 // the variable which are intilized right away are final variable and even thou u didnt give the static keyword int a but its considered as static inn interface
 int a =100;
 static int b =100; // static keyword here is optional , and its final by default

 // i can generate the constuctor also in regular class
    /*
    can not have constructor in interface
     */
   /* public PropertiesOfInterface(int a) {
        this.a = a;
    }*/

// static block is for class and not be in interface
/*static{

        b =100;



}
*/

    // u can not have instance variable because its not a class and if u dont havr variable u shouldnt have instance method
/*public void method1(){
    System.out.println("Instance method");
}*/


public static void method2(){ // if u have a static method u can call it through the interface name
    System.out.println("Static method");
}


public abstract void method3();

// another method type intorcued after java 8 is default method so the reason default method inroduced is because in instance method we give the body and but  in abstract method we cantt give body
    // now what is the sub class has same implementation for the method so another method is introduced which is default
    // shown below , its a method with body and can be implemented tp all the child class object of interface
    // to create default method we use speicifer default , this default is not modifier its a specifier
    public default void drink(){// for ex implemtation is same for all animal and i can not make it instance it will give compile error
        System.out.println("Default method");

    }
    // if implemantation iss same there is no need to over ride so u need a method with body anf instance method was not possible in interface so thats why default method was introduced
        // before java 7 it was impossible to create method with implemenation ( because it oly accept abstract method but thenn default method was introduced)




}
/*
can u achiever encapsulation in interface ?
no you cab never  achieve encapsulation you need private access modifier and here in interface u need to give public access modifier
 */
/*
so we can create abstract static and default method in interface
// and static method and default both were introduced after java 8
// the advantage of having dtatic method is u can call it through the class name u donbt need obj to call it
can we have toString method in interface ? no we cant becaus to string is and instance method
also any method in java can be overloaded remember
 the dfault method becomes instance in child class and can be treated as instance method
 if u have static method method why u need default method ?
 because static have onnly one copy while default is treated as instance and it can have multiple copies
 iterface can not i repat can not ave instance variable, instance method , objects , consyructor because its not a class
 what if interface inherits from another interface u can u extends keyword

 */