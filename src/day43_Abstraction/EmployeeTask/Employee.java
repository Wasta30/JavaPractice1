package day43_Abstraction.EmployeeTask;

public abstract class Employee extends Person{

    private final int id;
    private String jobTitle;

    private double salary;


    public Employee(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender);

        if(age<=0){
            throw  new RuntimeException("Invalid age:"+age);
        }
        this.id = id;
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public int getId() {
        return id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

public abstract void work();

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
