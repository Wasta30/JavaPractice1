package day43_Abstraction.EmployeeTask;

public class Teacher extends Employee{

    public Teacher(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }


    public void work(){
        System.out.println(getName()+" is teaching");
    }


public void sleep(){
    System.out.println(getName()+" sleeps 5 hours");
}





}
