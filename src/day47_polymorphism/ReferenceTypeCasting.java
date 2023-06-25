package day47_polymorphism;

import day43_Abstraction.EmployeeTask.Employee;
import day43_Abstraction.EmployeeTask.Person;
import day43_Abstraction.EmployeeTask.Tester;
import day44_Abstraction.AnimalTask.Animal;
import day44_Abstraction.AnimalTask.Cat;
import day44_Abstraction.AnimalTask.Dog;
import day45_Interface_AbstractionReview.ShapeTask.Circle;
import day45_Interface_AbstractionReview.ShapeTask.Shape;
import day45_Interface_AbstractionReview.ShapeTask.Square;

public class ReferenceTypeCasting {


    public static void main(String[] args) {

      //  new Circle(4);
     //   Shape shape = (Shape) new Circle(4);// upcasting
        // as long as u have super type as reference type no need to give
        // smaller type casted to larger automativcally
        // this is happening in background

        // it automaticlly casted , thats why circle assigned to shape without casting changing type not possible
        //
        //WebDriver driver =  new ChromeDriver; this is also upcasting
        // if there was no upcasting polymorphism is not possible


        // Downcssting : eexplict action is must
        // castiing larger ref type to the smaller sub type
        // must be done explicty and cast operator is req
        // why we do downcasting : because of polymorphsm rule
        //because the ref time decide what we can access
        // so if u want to access obj type properties not in ref time so thats why

        /*
        for ex person task
        tester do testing so can we able to acces this method ???
        so we need to convert it to smaller type (sub type)
        for ex bark method in dog class
        does animal acces it : no
        i need to cast it
         */


    //    Animal animal = new Dog("MAx","husky",'M',3,"small","white");
        // i can not call  bark method unless i do down
        //casting

        // how to assign dog to ref name animal
        //



        //

        //   Shape shape = (Shape) new Circle(4); //upcasting

        Shape shape2 = new Circle(5);

        // WebDriver driver = (WebDriver) new ChromeDriver();

        // Dog  dog2 = new Dog("Max", "Husky", 'M', 3, "Small", "White");;
        //  Dog dog3 = dog2;


        Animal animal = new Dog("Max", "Husky", 'M', 3, "Small", "White");

        //   Dog dog = (Dog)animal; // downcasting
        //  dog.bark();

        System.out.println( animal.getName() );
        // System.out.println( dog.getName() );

        (  (Dog)animal  ).bark(); // if u just want to use it once do it


        Shape shape1 = new Square(5);

        System.out.println( ((Square) shape1).getSide()  );


        System.out.println("---------------------------------------------------");

        Animal animal2 = new Cat("Jim", "Scotish", 'M', 3, "Small", "White");

        //Cat cat = (Cat) animal2;
        // cat.meow();

      //  ( (Cat) animal2 ).meow(); // this cat is refeing to same obj

        ((Cat)animal2).meow();
        // ( (Dog) animal2 ).bark(); // got ClassCastException// the object type of animal2 is cat and it has no is relationship with Dog ,

        System.out.println("---------------------------------------------------");

        Employee employee = new Tester("Ali",30,'M',42,"SDET",145000.00);

       // employee.BugReport(); // i cant call it from reference type due to polymorphism

        ((Tester) employee).BugReport();


        // ( (Tester)employee ).unitTest(); // it is in developer

        //  ( (Developer)employee ).unitTest(); // i cant still call it because its refering to employee which is related to Tester now

        // Driver driver = (Driver) employee;  // line 1 // line 1 ,3, all give excetpion because employee is for Tester here and we get ClassCastException
        Person person = (Person) employee; // line 2 , so we will not get exception herer because employee which is a Tester object , they have is a relation with person
        //    Teacher teacher = (Teacher) employee; // line 3

        System.out.println("----------------------------------------------------");

        Shape s1 = new Circle(10);
        s1.area();
        s1.perimeter();

        //  ( (Cube)s1 ).volume(); // i can not call the volume because the it is not necsaary to have volume in all shape also the object type which is circle has no volume
        //always see the object type s1 here belongs to circle



    }







}
