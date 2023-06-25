package day30_CustomClass;

public class Dog {// custom class
    // diff obj are in class
    // attributes and action are there
    // do not need main method in custom class (not meant running vlass only fr creating obj)
    public String name ; // decalared instancevariavle inside class outside method
    public String breed ;
    public int age;// instance meanse eaxh obj has separate copy
    public char gender;
    public String size;
    public String color;


    // if u givve sraric keyword so only one copy created so dont use static key word , i need sseparate copies for methods

    public void setInfo(String dogName, String dogBreed,int dogAge, char dogGender, String dogSize, String dogColor ){
        name =dogName;
        breed= dogBreed;
        age = dogAge;
        gender=dogGender;
        size= dogSize;
       color=dogColor;



    }



    public void eat(){

        System.out.println(name+" is eating");

    }

    public void bark(){
        System.out.println(name+ "is barking");
    }

// need toString to print every object in everysingle class
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
