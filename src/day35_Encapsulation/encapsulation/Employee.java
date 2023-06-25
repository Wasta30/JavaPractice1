package day35_Encapsulation.encapsulation;

public class Employee {

    // name , gebder , age , salary
    // encapsulate all private fields // give cond name can not be empty


    private String name ;
    private char gender;
    private int age;
    private double salary;

// do we have function that can set if name is correct , give set method

    public Employee(String name, char gender, int age, double salary) {
       // we wrote setter   in constructor
        setName(name);
        setGender(gender);
        setAge(age);
        setSalary(salary)

        ;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public String getName(){
        return name;
    }


    public void setName(String name){
    if(name.isEmpty()){
        return;
}

        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(!(gender=='F' || gender =='M')){
            return; // if charcter is not M or F exit it
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<16 || age >90){
            return;
        }

        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary <=0){
            return;
        }
        this.salary = salary;
    }
}
/*
1. Create an Employee Class:
			private variables:
				name, gender, age, salary

			Encapsulate all the private fields

				1. Name can not be empty
				2. gender can not anything other than female or male
				3. age can not be less than 16, and greater than 90
				4. salary can not be zero or negative

 */