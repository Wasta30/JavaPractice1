package day40_FinalKeyword;

public class ProtectedAccessModifier {

    /*
    default modieifer cant use out side pckg
    protected can be used in subclasses andd also public
    public and protected visible in sub class
    protected is also not visible outside pckg
    proytected is only visible in subclass(when there is inheritance)
    the only diff between default and protected is of subclass
     */

     static  String name1 = "Cydeo"; // modifier is default here
    // it can be inherited to the classes of same pckg
    protected static String name2 = "WoodenSpoon"; // can be inherited if class is subclasss



    static void method1(){

    }


    protected  static void method2(){

    }











}
