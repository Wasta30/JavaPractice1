package day30_CustomClass;

public class Student {

    // attributes
    /*
    name
    gender
     */


    public String name;
    public  char gender;
    public int age;
    public int ID;
    public  char grade;

    public void setInfo(String name, char gender, int age, int ID, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }


    // local variable can share the same name also in java
    // this one is local  variable the above one is instance variable
   /* public void setInfo(String name, char gender ,int age, int ID, char garde ){



        // instance and local are same in this case when i called name so name is assigned to name itself and ye instance variale nahi hoga
        // use this keyword and this will show kay hm instance variable ki bat kr rahay hainn
        // this keyword with dot is used for calling the instance
        this.name = name;
        this.gender= gender;
        this.age = age;
        this.ID= ID;
        this.grade=grade;
        // garde= grade by default it will call local variable grade but now instance variable


    }*/


    // shortcut for generating the setInfo method yhe naame is not setInfo






    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }


public void code(){
    System.out.println(name+" is coding");
}


public void study(){
    System.out.println(name+" is studying");


}

public void sleep(){
    System.out.println(name+" is sleeping");
}
}
