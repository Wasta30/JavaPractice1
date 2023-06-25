package day40_FinalKeyword;

public final class Dog extends Animal{

    public Dog(String name, String breed, char gender, String color, int age) {
        super(name, breed, gender, color, age);
    }



    public void eat(){// this is the diff implementation as parent class as this method is not final
        System.out.println(getName()+ " is eating dog food");
    }


  /*  public  void drink(){// once we make it final its uncahngeavle and cant be overridden
        System.out.println(name+" is drinking water");

    }*/

    public void bark(){
        System.out.println(getName()+" is barking");
    }



    public static void main(String[] args) {








    }





}
// for wat method : dog is eating dog food and i can use eat method by overriding