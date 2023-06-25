package Day31_CustomClass_Constructors;

public class PersonObject {

    public static void main(String[] args) {
        
         Person person1=new Person("Wasta Tariq",'F',25);

        System.out.println("person1 = " + person1);
        
        Person person2 = new Person("Jiya",'F',27);
        
        // for  each of the obj the constructor executed separatily

        System.out.println("person2 = " + person2);
        person2.age=38; // if u want to change the data u  can do this
        // or if u want to change whole reassign it
        











    }
    
    
    
    
    
    
}
