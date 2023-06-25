package Day32_Constructor;

public class EmployeeObject {

    public static void main(String[] args) {
        
        
        // i created the objc of employee and only atribute i set is name what about gender salary etc 
        Employee employee1 = new Employee("Wasta");

        System.out.println("employee1 = " + employee1);
        
        
        Employee employee2 = new Employee("Jiya",'F');

        System.out.println("employee2 = " + employee2);

   Employee  employee3 = new Employee( "Wasta",'F',"SDET");
        System.out.println("employee3 = " + employee3);




    }
    
    // if u have multiple constructor u have more option to create more object
    
    
    
}
