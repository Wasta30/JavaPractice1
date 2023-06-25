package Day33_Statics;



public class EmployeeObjects {


    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name= "Wasta";
        employee1.salary=12000;

        Employee employee2 = new Employee();
        employee2.name ="Jiya";
        employee2.salary=11000;


        Employee employee3 = new Employee();
        employee3.name = "Taha";
employee3.salary=13000;
        System.out.println(employee1.name+": "+employee1.salary);
        System.out.println(employee2.name+" :"+employee2.salary);
        System.out.println(employee3.name);

        System.out.println(employee1.isHuman);
        System.out.println(employee2.isHuman);
        System.out.println(employee3.isHuman);


    }




}
