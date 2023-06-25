import java.util.Arrays;

public class Student {// nt under any pckg

// this is just a exapmple to share ur soluton in discord


    public String name ;
    public char gender ;
    public int age ;
    public int studentID;
    public char grade;


    public Student(String name){
        this.name=name;
    }

    public Student(String name , char gender){
        this(name);
        this.gender=gender;
    }

    public Student(String name , char gender,int age){
        this(name,gender);
        this.age=age;
    }


    public Student(String name , char gender, int age ,int studentID){
        this(name,gender,age);
        this.studentID=studentID;
    }


    public Student(String name , char gender, int age ,int studentID,char grade){
        this(name,gender,age,studentID);
        this.grade=grade;
    }


    public void Study(){
        System.out.println(name+ " is studying");

    }
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentID=" + studentID +
                ", grade=" + grade +
                '}';
    }
}
/*
Student Task:
		1. Create a class called Student:
				Attributes:
					name, gender, age, studentID, grade

				Add a constructor that allows user to create object by setting the name of student

				Add a constructor that allows user to create object by setting the name and gender of the student

				Add a constructor that allows user to create object by setting the name and studentID of the student

				Add a constructor that allows user to create object by setting the name, studentID and grade of the student

				Add a constructor that allows user to create object by setting the name, gender and age of the student

				Add a constructor that allows user to create object by setting the name, gende, age and studentID of the student

				Add a constructor that allows user to create object by setting the name, gende, age, studentID and grade of the student

				Actions:
					toString()
					study()


 */

class StudentObjects{

    public static void main(String[] args) {

        Day33_Statics.Student student1 = new Day33_Statics.Student("Wasta");
        System.out.println("student1 = " + student1);


        Day33_Statics.Student student2 = new Day33_Statics.Student("Javeria", 'F');

        System.out.println("student2 = " + student2);

        Day33_Statics.Student student3 = new Day33_Statics.Student("Jiya", 'F', 27);

        System.out.println("student3 = " + student3);


        Day33_Statics.Student student4 = new Day33_Statics.Student("Fatima", 'F', 23, 23);

        System.out.println("student4 = " + student4);

        Day33_Statics.Student student5 =   new Day33_Statics.Student("Neha",'F',25,2345,'A');
        System.out.println("student5 = " + student5);


        Day33_Statics.Student student6 =   new Day33_Statics.Student("Taha",'M',22,234,'B');
        System.out.println("student6 = " + student6);

        Day33_Statics.Student student7= new Day33_Statics.Student("Meesam",'M',27,276,'F');


        System.out.println(student1==student2);

        Day33_Statics.Student[] students = {student1,student2,student3,student4,student5,student6,student7};


        System.out.println(Arrays.toString(students));


    }
}