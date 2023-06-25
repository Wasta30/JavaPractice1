package day43_Abstraction.EmployeeTask;

public class Developer extends Employee{


    public Developer(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }


public void work(){
    System.out.println(getAge()+" is developing application");
    }



    public void sleep(){
        System.out.println(getName()+" sleeps 6 hours");
    }


public void unitTest(){

    System.out.println(getName()+" is unit testing");


}



}
