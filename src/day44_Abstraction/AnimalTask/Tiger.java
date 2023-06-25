package day44_Abstraction.AnimalTask;

public class Tiger extends Animal implements WildAnimal{

    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats meat");
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is hunting animals");
    }
}
// the modifier is always public inn interface or also while over riding in subn class more visible access modifier is used whihc is onnly optionn in innterface .