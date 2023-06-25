package day37_Inheritance.scrumTask;

public class Developer extends Employee {// developer IS A employee, developer IS A person

    public Developer(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender, jobTitle, id, salary, companyName);
    }



    public void fixBugs(){
        System.out.println(name+ " is fixing bugs");
    }




}
