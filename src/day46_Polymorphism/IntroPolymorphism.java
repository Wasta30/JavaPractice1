package day46_Polymorphism;

import day36_Inheritance.inheritance.Animal;
import day36_Inheritance.inheritance.Cat;
import day36_Inheritance.inheritance.Dog;
import day43_Abstraction.EmployeeTask.*;
import day44_Abstraction.AnimalTask.Playable;
import day45_Interface_AbstractionReview.ShapeTask.*;

import java.util.ArrayList;

public class IntroPolymorphism {

    /*

polymorphism is came from greek language : many forms
in java the objects has many form described by polymorphism
    the ability of object to take many forms is called polymorphism
    without is a relation polymorphism csn not exist so without inheritance there is no abstraction and also polymorphism
  one reference type for many object is called polymorphism
  forfor exam dog cat eagle has is a relation with animal and

     */


    public static void main(String[] args) {

        String str = "Wodeen Spoon";
        Integer n1 =2;
        Boolean r1 = true;
        double n2 = 5.5;

        // can i put them in array ? if i want to store it in one plac r

        // no i can not becayse string booleab integer anything to do with each other
        // so i need to give the parent and object is the parent of all class does not matter if its string object , double object , integer object
        // object can be anything circle rectangle square etc
        // object is the parent class
        Object[] array = {str,n1,n2,r1};


        /*
        so in selenium we use diver for all and we inherit this from some baseclass and if i want to use chrome this driver has to refernce to chromeDriver
        driver = new ChromeDriver();
        so whenver u want to do automation on chrome make sure the driver is referenced to chromedriver


        so polymorphism is u can have one variavble so it can be reference to all child class object
        so we make the refernce type of driver is WebDriver and the Webdriver is an interface , how can we make the interface reference to all driver because its a parent interface , all those chrome driver firefox driver have is a relationship thats why we achieve polymorphism here

        with the help of polymorphism we are able to do cross browser testing
        regardless what driver it is chrome safari firefox so we can ve one driver variable it reference to chrome firefox safari etc
        // parent can always reference to the child class this is polymorphism
        and without polymorphism one class can not reference to another
        and refernce is the parent , means there must be is a relationshipn
        for ex


        Employee Tester = new tester();
        Employee Developer = new developer();
        Emmployee Teacher = new Teacher ();

        so i used one reference type but it is refereing to 3 diff object
        Animal is a parent class and object type is child like dog or cat
        // poly morphism can occur with interface also remember

        for ex bug report is only for tester but this is not in the refernce type
        but work methos is in the reference and also in tester so i can call it
        so work method came from reference type and wahtever object type we give the implemnattion for test will be shown or if i use developer the implementation for developer will be shown

         */

        /*

        Animal animal = new Dog();
        animal.drink(); if it has one imnplementation in parent that will print
        or if i over ride it in animal class that implemnation will print

        so the object type decide which implemntation will occur and shown when the method has multuple implemnattion

        in java reference type decide what u can access



         */



        Employee tester = new Tester("Ali",30,'M',42,"SDET",145000.00);
        Employee developer = new Developer("Alex",28,'M',32,"Web Developer",155000.00);
        Employee teacher = new Teacher("Angel",28,'F',22,"English Teacher",85000.00);
        Employee driver = new Driver("Jhon",34,'M',42,"Lyft Driver",75000.00);

        ArrayList<Person> cydeoEmployees = new ArrayList();

        cydeoEmployees.add(tester);
        cydeoEmployees.add(developer);
        cydeoEmployees.add(teacher);
        cydeoEmployees.add(driver);


        System.out.println("-------------------------------------------");

        Employee employee = new Tester("Ali",30,'M',42,"SDET",145000.00);
        employee.work();
        // employee.bugReport();

        /*
            WebDriver driver1 = new ChromeDriver();
            WebDriver driver2 = new ChromeDriver();
            driver1.get(amazon)
            driver2.get(google)
            Animal animal = new Dog();
            animal.drink()
            Animal animal = new Cat()
            animal.drink()
            Animal animal = new Tiger()
            animal.drink()
         */

      /*  Animal animal = new Dog("Max", "Husky", 'M', 3, "Small", "White");
        animal.drink();
        animal.eat();
        // animal.play();
        //  animal.bark();*/


     /*  // Playable animal2 = new Dog("Max", "Husky", 'M', 3, "Small", "White");
        System.out.println(animal2.isFriendly);
        animal2.play();
        //  animal2.drink();
        //  animal2.eat();
*/

    /*    Animal animal3 = new Cat("Max", "Husky", 'M', 3, "Small", "White");
*/
        Shape shape = new Circle(5);
        shape.area();

        //  System.out.println( shape.getRadius()); // why i cant call it because not eveyrsingle sshape has radius or pi
        // System.out.println( shape.PI);



        // so if one refernce type refernce to many object
        // how can i verify if object type belong to refernce type we can find it by instanceofkeyword and instnce of retrun boolean experssion
        boolean isSquare = shape instanceof Square;
       boolean isRectangle = shape instanceof Rectangle; // this is givng me false because the shape is refering to circle and cirlce does not came from triangle rectangle and sqaure
      boolean isTriangle = shape instanceof Triangle;
        boolean isCircle = shape instanceof Circle;

        System.out.println("isSquare = " + isSquare);
        System.out.println("isTriangle = " + isTriangle);
        System.out.println("isRectangle = " + isRectangle);
        System.out.println("isCircle = " + isCircle);



        /*
        WebDriver driver:
            if(driver instanceof Chrome){
                Chrome browser will open
            }else if(driver instanceof firefox){
                Firefox browser will open
            }
            ...
         */





    }

}
