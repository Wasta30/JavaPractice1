package day36_Inheritance.encapsulation;

public class StudentObject {

    public static void main(String[] args) {
        
        
        Student student1 = new Student("Wasta",29,'F','A',"Cydeo");

        System.out.println("student1 = " + student1);
        
        student1.setGrade('B');

        System.out.println("student1 = " + student1);
        
    }
}
