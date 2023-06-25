package day44_Abstraction.AnimalTask;

public class Cat extends Animal implements  Playable{
// i can not make sub class abstract because no object can be created from the abstract class
    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }


    public void meow(){
        System.out.println(getName()+" is Meowing");
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats biryani");
    }

    @Override
    public void play() {
        System.out.println(getName()+" is playing with kids");
    }
}
