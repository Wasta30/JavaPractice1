package Day33_Statics;

public class Iphone {
// sttaic : same for all objects
    // for instance we dont know exact values
    public static String brand= "Apple";// static we assign value
    public String model;// instance
    public double price;
    public static String OS = "iOS";
    public String color;
    public  String size;
    public static String madIn = "China";
    public static boolean hasbattery= true;
    public static boolean istouchScreen= true;
    public static boolean hasFaceTime = true;



    // static method can only call static variable
    // and not accept instance variable as they belong to the object
    // class does not cam from object
    // static variable not accept instanfe method
    // can objc share what class has or in other words can instance method shared what class has (static)
    // sttaic method only takes static but instanfe takes instance and static both variable
    //
    public  static void printModelAndPrice(){
   //     System.out.println(model+" "+price); // static not accept instance
        System.out.println(OS);
    }


public void method1(){
    System.out.println(model+" "+price);
    System.out.println(OS);
}

// if method instanfe u hve to create objc and takes extra memory
    // but static method just calll i from class name and no need to creat any object at all


    public static void printOperatingSystem(){
        System.out.println(OS);
    }


// can objc share what the class has : yes thats why instance method accept static variable but static method not accept instance as static comes from class and instance comes from object
// in order to call instance variable u have to call object but static can be called without obejct direcly from class name
}
