package day39_Recap.cydeoTask;

import day01_JavaIntro.Test;

public class Cydeo {
    public static void main(String[] args) {

        Tester tester = new Tester("Wasta",25,'F',1234,"SDET",6000);
        System.out.println(tester);
        Developer developer = new Developer("Taha",23,'M',1234,"Developer",17000);

        Teacher teacher = new Teacher("Jiya",27,'F',12345,"Senior teacher",18000);
        Student student = new Student("Jalal",27,'M',234,"Mechnical Engineering");


        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(student);


        student.setFieldOfStudy("Material Engineering");
        System.out.println(student);





    }
}
/*
7. Create a class named Cydeo:
            create objects of Tester, Developer,Teacher, Student

            test all the functions of each objects

            Analyze the relationships between the classes



 */
