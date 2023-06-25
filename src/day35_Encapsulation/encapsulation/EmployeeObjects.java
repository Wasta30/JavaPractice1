package day35_Encapsulation.encapsulation;

public class EmployeeObjects {

    public static void main(String[] args) {

// we used setters in constructor
        Employee employee1 = new Employee("wasta",'F',24,24500);

        System.out.println(employee1);

// howto make change in this , the onluy way to change data is by ser

        employee1.setAge(34);

        System.out.println(employee1);



    Employee employee2 = new Employee("Jiya",'F',27,2400);

    employee2.setName("Javeria");
    employee2.setSalary(employee2.getSalary()+5000);
        System.out.println(employee2);


    }




}
