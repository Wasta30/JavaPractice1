package day43_Abstraction.EmployeeTask;

public class Tester extends Employee {


    public Tester(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    public void work(){
        System.out.println(getName()+" is testing the application");

    }


public void sleep(){
    System.out.println(getName()+" sleeps 7 hours at night");
}


public void BugReport(){
    System.out.println(getName()+" is creating the bug report");

}


}
