package day30_CustomClass;

import java.util.ArrayList;

public class StudentObject {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Wasta",'F',25,2245,'A');

        System.out.println("student1 = " + student1);

        Student student2 = new Student();
student2.setInfo("Jiya",'F',27,3345,'A');

        Student student3 = new Student();

        student3.setInfo("Taha",'M',22,3346,'B');



        Student student4 = new Student();

        student4.setInfo("Nehal",'M',25,33456,'C');


        Student student5 = new Student();

        student5.setInfo("Jalal",'M',27,34456,'A');

        Student student6 = new Student();
        student6.setInfo("Irteza",'M',24,344567,'B');



        Student[] students = {student1,student2,student3,student4,student5,student6};

        for (Student each : students) {
            System.out.println(each);

        }


        System.out.println("-------------");
        //find  early birds 

        ArrayList<Student> earlyBird = new ArrayList<>();// student with garde A
        ArrayList<Student> angryBirds = new ArrayList<>();
        
        // iterate aray with loop
// so uper jo array hmne uspe loop apply kia each : each students 
        for (Student each : students) {// array which contain all student object
            if(each.grade=='A'){
                earlyBird.add(each);
            }else {
                angryBirds.add(each);
            }
        }

        System.out.println("earlyBird = " + earlyBird);

        

    }




}
