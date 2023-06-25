package day35_Encapsulation.encapsulation;

public class Person {
    // public data is not secure
    private String name ;// ca not use outside
    private int age ;

    // i  do  not ve direct acces so in order to give ability to other class to set is we use setter


    // we encapsulate instance variable and not static variable

    public String getName(){
        return name;
        // its just like rading what this value is
    }
    // in order to rreassign variable pass parameter
    public void setName(String name){
        this.name = name;
    }

    // static means one value for all
    // i can read data by get and change data by set


    public int getAge(){
        return  age;
    }

    public void setAge(int age){
        if(age<=0 || age > 150 ){
            System.err.println("Invalid age");
            System.exit(0);
        }


        this.age=age;
    }

// getter and setter are method so we can give cond with in the block in case of public we could nott do it



}
