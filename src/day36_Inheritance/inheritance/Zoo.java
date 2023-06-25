package day36_Inheritance.inheritance;

public class Zoo {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setInfo("Max","Husky",'M',"Small",5,"White");

        dog.eat();
        dog.bark();
        dog.drink();
        dog.eat();
        //dog.hunt(); cant do this
        System.out.println(dog);




        Cat cat = new Cat();
        cat.setInfo("Lilly","British",'F',"Large",4,"Red");
        cat.move();
        cat.drink();
        cat.meow();
        cat.sleep();
        System.out.println(cat);

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher  Khan","Bengal",'M',"Small",6,"Orange");

        tiger.hunt();
        tiger.sleep();
        tiger.move();
        tiger.drink();
        tiger.roar(); // unique

        System.out.println(tiger);



    }





}
