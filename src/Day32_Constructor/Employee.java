package Day32_Constructor;

public class Employee {
    // more than one constructor in a class by overloading

    public String name;
    public char gender;
    public String jobTitle;
    public double salary;

    // what benefit this constructor give me now ?
    public Employee(String name){
    // constructor can not call or contain itself     this(name);
        this.name = name;
    }


    // const name must be same with class
    public Employee(String name, char gender){

        // can not call constructor by its name
      //  Employee(name)// u already have this so u can call the method in another method
        this(name);   //this.name =  name; (As as this)// this is how u call the constructor method bu using this keyword
       //this.name =  name;
        this.gender=gender;
    }



    // i can not call constructor in another method , so i can not call another method with in constructor but when it comes to reguler method i can call it in another method
    // if u want to call constructor name use this keyword with parenthesis
    // what does it mean if u have multiple constructor u have option to create ,ultiple objects


    public Employee (String name , char gender, String jobTitle){

        //this.name=name;
     // this.gender=gender;
        this(name,gender); // second constructor calling
      this.jobTitle=jobTitle;



    }


    public Employee (String name , char gender, String jobTitle, double salary){

        this(name,gender,jobTitle);// this is third constructor (shown above)
        this.salary=salary;


    }




    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
// this. = used for calling instance variable or method in java
// this() : use for calling constructor
// a constructor can onnly be called inside other contructor
// consgtructor call must be in the first step otherwise u will get the compile error
// one constructor can not call more than one constructor
// the constructor can not call itself