package day35_Encapsulation.encapsulation;

public class PersonObject {
    public static void main(String[] args) {


        Person person1 = new Person();

        // i  did not declare constructor in class so its a default constructor
        // and i can not directly call name directly as data is private
        // we encapsulate it by making it private


        person1.setName("Wasta");
        person1.setAge(25);


        //System.out.println(person1.name+" "+person1.age);
        // the only way to read data is by get method

        System.out.println(person1.getName()+" : "+person1.getAge());


// why there is a need of private acces modifier if we have to get getter and setter
        // if the data is public  it does not ve any restriction in assigning any vaalue to it
        // u can not control what value are stored and its not safe so in this case we make it private
        // we can also give connd inside the method body


    }

}
