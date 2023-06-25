package Day31_CustomClass_Constructors.scrumTask;

public class Tester {

    public String name ;
    public  int employeeID;
    public  String JobTitle;
    public double salary;


    public Tester(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        JobTitle = jobTitle;
        this.salary = salary;
    }


public void smokeTesting(){

}

public void creatingTicket(){


}

public void dailyStandUp(){

}

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", JobTitle='" + JobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
/*

Scrum Task:
	create a class called Tester
	        Attributes:
	            name, employeeID, JobTitle, Salary

	        Add A constructor that can set all the fileds

	        Actions:
	           smokeTesting(),  creatingTicket(), dailyStandUp() toString()
 */