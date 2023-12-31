package day44_Abstraction.AnimalTask;

public class Eagle extends Animal implements  WildAnimal, Flyable{


    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats chicken");
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is huntinng ");
    }

    @Override
    public void fly() {
        System.out.println(getName()+" is flying");
    }
}
