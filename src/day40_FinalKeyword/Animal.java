package day40_FinalKeyword;

public class Animal {

    private String name;
    private final String breed; // i want the breed to be unchangeable so keep it final
    private final char gender;
    private final String color;

    private int age;


    // we are getting tthe compile erroer because  instance belong to object and in order to create a object we need to create the consytructor first
    public Animal(String name, String breed, char gender, String color, int age) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.color = color;
        this.age = age;
    }


    // setter can not be generated for any variable that is unchangeable so for final setter can not generated

    // how many getter and setter generated here ?
    // the purpose of getter is to just reas data and we vcan apply getter on final keyword


    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }



// SETTER :
// so these are the variable not declared as final , if the variable is final we can not generate setter for them

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }



public void eat(){
    System.out.println(name+" is eating ");
}


public final void drink(){// once we make it final its uncahngeavle and cant be overridden
    System.out.println(name+" is drinking water");

}






 }
