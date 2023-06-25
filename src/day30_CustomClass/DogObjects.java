package day30_CustomClass;

public class DogObjects {

    // instance methd/ or variable : means separate copy of objc (bhle method ho ya

    // need a main method because we will create a object here while in custom class no maon method

    public static void main(String[] args) {

        // creating dog class object
        // = new constructor
        // the data type for this variable dog/ onbject  is Dog
        Dog dog1 =new Dog();// object of dog created
// from object name put dot operator and store object in it
        dog1.name = "Lucy";
        dog1.breed= "Husky";
        dog1.age=5;
        dog1.gender= 'F';
        dog1.size ="Small";
        dog1.color="White";

// compiler looks for to string method when u pass object in PS
        System.out.println("dog1 = " + dog1);


// object came from the class so i have to generate a toString method in the dog class 


        Dog dog2 =new Dog();
        dog2.name = "ACE";
        dog2.breed="Husky";
        dog2.age= 4;
        dog2.gender= 'M';
        dog2.size= "Large";
        dog2.color = "Black";
        System.out.println("dog2 = " + dog2);

// easy way to call , create method setInfo
        Dog dog3 =new Dog();
        
        dog3.setInfo("Paul","Husky",6,'M',"Small","Black");

        System.out.println("dog3 = " + dog3);


    dog1.eat();

    dog2.bark();


    Dog dog4 = new Dog();
    dog4.setInfo("Nehal","Husky",3,'M',"Small","Black");


    Dog dog5 = new Dog();
    dog5.setInfo("Lilly","Husky",6,'F',"Small","White");

    Dog[] dogs = {dog1,dog2,dog3,};



    }










}
