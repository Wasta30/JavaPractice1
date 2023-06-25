package day30_CustomClass;

public class CapitalOne {

    public static void main(String[] args) {

        // this captialone hirng 5 employees

          Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();


        employee1.setInfo("Wasta",25,'F',2245,"Engineer",2000,true);
        employee2.setInfo("Wajeeha",27,'F',2246,"SDET",2500,false);
        employee3.setInfo("Taha",26,'M',2247,"QA",2000,true);
        employee4.setInfo("Ebbad",28,'F',2248,"Developer",25000,false);
        employee5.setInfo("Nehal",29,'M',2249,"Manager",2400,false);

    Employee [] employees = {employee1,employee2,employee3,employee4,employee5};

    // find how many are full time employee

        int countFullTime =0;
        int countPartTime=0;
        double max = employees[0].salary;
        double min = employees[0].salary;
        // first employee salary consider as max
        for (Employee employee : employees) {// if everysingle employee is full time count increase by 1

            if(employee.isFullTime){
                countFullTime++;
            }else {
                countPartTime++;
            }
            if(employee.salary>max){
                max=employee.salary;
            }

            if(employee.salary<min){
                min = employee.salary;
            }
        }

        System.out.println("countFullTime = " + countFullTime);
        System.out.println("countPartTime = " + countPartTime);
        System.out.println("max = " + max);
        System.out.println("min = " + min);


    }






}
