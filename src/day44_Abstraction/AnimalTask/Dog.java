package day44_Abstraction.AnimalTask;

public class Dog extends  Animal implements Playable{
    // before extends add method or variable that can not be inherited to child class
    // what happens when non abstract class to abstract class
    // for this we have to give each abstract method a body by over riding it


    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);// supoer keyword to call parent class constructor , means these things must be set
    }

    @Override
    public void eat() {
        System.out.println(getName()+" east pizza ");
    }

    public void bark(){
        System.out.println(getName()+" is barking");

    }

    // inherit this from innteface
    // caan non abstract class have a method without body : no so we need to over ride it

    @Override
    public void play() {
        System.out.println(getName()+" is playinng with puuppies");
    }
}
