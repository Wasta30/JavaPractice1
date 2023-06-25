package day34_GarbageCollection_AccessModifiers;

public class Circle {

    // do i  need a constructor for pi no its already know as we make contsructor for unknow
    // i can not use contsructor to set static variable , how many time constcutor run multiple time
    // as constructor run separately for each objc if its static i need to intiliaze it one time so thats why never ever need contsructor for static , it wont give u error but not a good practice

    public double radius;
    public static double pi;
    public static String name;


    public Circle(double radius){// not intialize sttaic in constructor
        this.radius=radius;
        pi=3.14;
    }


    // in order to set static i have static , and it can not accept instance variable

    static{// it will run one time and thats why we cannnot set instance variabe
        pi = 3.14;
        name = "Circle";

    }








}
