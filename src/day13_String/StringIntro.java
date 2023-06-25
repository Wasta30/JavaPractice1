package day13_String;

public class StringIntro {

    public static void main(String[] args) {

        // String classes
        // every single class has method that object can use
        // this string class is also presented in a different package
        /// and if we are using any class from other pckg we have to import it
        // for ex scanner came from util which is  a sub pckg of java
        // string is a class of lang pckg, which is also another pckg inside java
        // so sting needs to be imported from string /
        // but why we dont import string it stills allows me to use
        // lang packg is a special pckg, and if are using any class from lang pckg it can be impirted implicitly and compiler can do it for us
        // but any class must be import in order to use it
        // string is meant to be for the char sequences , combination of multiple characters'
//class has the objects ,class u can consider it as a tempelate sepcifiy what objects needs
        // every single character u see in string has a number called index number
        // thats why string prints in order because they follow index nubers
        // index numbers in java starts from zero
        // "cydeo" : 01234 index numbers , the index numbers depends on the characters u have
        //so if i have 5 characters the maximum index number is 4
        //  the characters starts from 1 and index numbers starts from zero
        // srting is immutable means object can not be changed
// two ways to create
        // string literal : very special objects compared to any objects in java because there is a special memory or location for all the string literal called string pool
        // java heap : its a jjava memory every single object u created it takes memeory these objects are stored here
        // String name = "Cydeo"; cydeo is the object
        //
        //  String name = "Wooden Spoon";  // this word is stored in java heap and not in intelijj
        // only objects which are string literal(mmeans objects  using double quote_ are stored in string pool
        // all the local variable are stored in a place called stacked , they are not takin extra memory

        // heap : its for all objects
        // stack is for variables associated with objects
        //  // String name = "Cydeo";
        //   name = variable stored in stack and object = cydeo stored in heap

        // the string pool does not take duplicate for exm
        // String str1 = "java";  both have same object so take one place in heap
        // String str2 = "java";
        // so if we have more than objects sharing same seq of character so it will take one place in heap,


        String name = "wooden spoon";
        String name1 = "wooden spoon";
        String name2 = "wooden spoon";
        String name3 = "wooden spoon";
        String name4 = "wooden spoon";
        // i created 4 string variable and using string literal to create four objects
        // how many objects we have in the heap?  its only one inside the heap
        // string pool does nt take duplicateeeee remember

        System.out.println(name == name2); // true
        System.out.println(name2 == name3);// true
        System.out.println(name3 == name4); // true
        // so theyy are pointing towars same object and we got true

// but this is not the only way to create object in the string class there is also another way of creating objects in string class
// by using a new keyword we can create an object, also called object , object with newkeyword
        // and whwnever the new keywords is involved it creats two different objects
        // no matter if the object is same or different means aggar "java"
        // "java" bhi ho jab bhi and this will be stored outside the stribng pool because its not a string literal
        // so everytime new keyword involve it create new differnt object in heap outside the string pool
        /// so outside string pool its able to create 2 diff object qk hmko pata string pool duplicate accept krta

        // for example

        String str1 = new String("Wooden Spoon");
        String str2 = new String("Wooden Spoon");
        String str3 = new String("Wooden Spoon");


        System.out.println(str1==str2); // false cause not same object
        System.out.println(str2 == str3); // false

        // so hamesha string pool analyze kro even thou same seq of character hain but new jab hoga to unko alag consider krte or agar same obj hon or variable alag hon still ek objcect stred hoga in case of string literal cause string litearl k case mai object duplicate nae hote

        System.out.println("------------------------");
        // method to compare string means sirf value dekhni hai and wo same hai jese java for sting literak mai and java new main bhi to eqaul method use kro
        String s1 = "Java";
        String s2 =  new String ("Java");
        // do not use this == operator when it comes to compare objects always use equals() method
        // so compare s1 and s2 , and u want to compare seq of character its give me trur
// this eqal mehtod checks the value of objects
        System.out.println(s1.equals(s2));

        String s3 = "Java";
        String s4 =  new String ("java");

        System.out.println(s3.equals(s4)); // now i get false cause java is case sensitive



        // must know methods of string in order to know string manipulation
        // charAt gives index number , means give u char and it gives index number



    }


}
