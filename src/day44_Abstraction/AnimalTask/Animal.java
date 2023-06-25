package day44_Abstraction.AnimalTask;


// getsimpleName : it returns class name only for ex here its animal
// and if u want whole info use getName

/*class test{
    public static void main(String[] args) {


        System.out.println(new test().getClass().getSimpleName());// give class name only and if u want other claases to have its own name call this method
        System.out.println(new test().getClass().getName());// give full info

    }*/
// every single abstract class has a sub class encapsulation and inheritance dont depend on each other
// the connd for abstraction and polymorphism to have inheritance

public abstract class Animal {
// abstraction : hide implementation so only onc of imp part , means conc on essential
    // abstraction method : method without implemenmtation
    private  String name;
    private final String breed;

    private final char gender;

    private int age;

    private String size;

    private final String color;

    public static boolean canBreath;

    static {
         canBreath = true;

    }

    public Animal(String name, String breed, char gender, int age, String size, String color) {
       setName(name);// it contain all cond before setting variable
        this.breed = breed;

        if(!(gender=='M'||gender=='F')){
    throw  new RuntimeException("Invalid gender:"+gender);
        }
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            throw new RuntimeException("Invalid name");
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

public abstract void eat();

    public void drink(){
        System.out.println(name+" drinks water");
    }

    @Override
    public String toString() {// if i want the name for each speific class in each animal like dog cat etc
      // so now u dont have to see animal in every class (sub class)
        //  getsimpleName gets the class name onlu
        return getClass().getSimpleName() +"{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';

  // if u want to give cond for final variable give it in constructor and if its instance variabel giive it in setter
    }
}
/*
Animal Task:
		Create an abstract class named Animal:
			Variables:
				name, breed(final), gender(final),  age, size, color(final)
			Encapsulate all the fields
			Add a constructor that can set all the fields
			Methods:
				eat(); ==> different animals eat different foods
				drink() ==> all the animals drink water
				toString() ==> to display the full info of the animal
 */