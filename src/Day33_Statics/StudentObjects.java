package Day33_Statics;

import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Wasta");
        System.out.println("student1 = " + student1);


        Student student2 = new Student("Javeria", 'F');

        System.out.println("student2 = " + student2);

        Student student3 = new Student("Jiya", 'F', 27);

        System.out.println("student3 = " + student3);


        Student student4 = new Student("Fatima", 'F', 23, 23);

        System.out.println("student4 = " + student4);

        Student student5 =   new Student("Neha",'F',25,2345,'A');
        System.out.println("student5 = " + student5);


        Student student6 =   new Student("Taha",'M',22,234,'B');
        System.out.println("student6 = " + student6);

       Student  student7= new Student("Meesam",'M',27,276,'F');


        System.out.println(student1==student2);

    Student [] students = {student1,student2,student3,student4,student5,student6,student7};


        System.out.println(Arrays.toString(students));


    }
}