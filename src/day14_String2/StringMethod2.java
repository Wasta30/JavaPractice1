package day14_String2;

public class StringMethod2 {

    public static void main(String[] args) {

        // replace method : u pass two argument one is old value and one is new value 

        String str = "Java is fun, I love learning Java";
        // if i wnat to replace all the word java from here i can use it 
        // u first pass ur old argument / value and then pass second arguement

        String str2 = str.replace("Java", "Python");
        // is this method modified the old string no it creates new string object


        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email = "Johnsmith@yahoo.com";
        // if u want the same variable to have diff value assign it jese maine neche dia hai
        email = email.replace("yahoo", "gmail");

        System.out.println("email = " + email);

        String sentence = "Java Java Python Python C+ C+ C+ Python Python Python";
        // if u want to remove python from the above string just give empty string that way all python will go

        String sentence2 = sentence.replace("Python", "");
        System.out.println("sentence2 = " + sentence2);

        String s = "Dog Dog Dog Dog Dog Dog";
        // replace  all dog with cat
        s = s.replace("Dog", "Cat");

        System.out.println("s = " + s);

        String s2 = "C# is fun , C# is cool";

        // oonly i want to replace C# which is beside is cool
        s2 = s2.replace(" C#", " Java");
        System.out.println("s2 = " + s2);

        String s3 = "Java";
        // u can replace one character also for example replace a with e
        s3 = s3.replace("a", "e");
        System.out.println("s3 = " + s3);


        System.out.println("-----------------------");

        // replacefirst method used to replace value from old to new ,only the firsdt matching one
        // while replace method replace its going to replace all word
        // for exapmle (java,java,java) replacefirst onl;y replce firstone

        String result = "Java Java Java";
        result = result.replaceFirst("Java", "Python");

        System.out.println("result = " + result);

        String result2 = "C# is fun, C# is cool";
        result2 = result2.replaceFirst("C#", "Java");
        System.out.println("result2 = " + result2);
// cntrl f in word document does the same thing it will replace word (extra izafa lol)


        String result4 = "Java";
        result4=result4.replaceFirst("va","vo");
        System.out.println("result4 = " + result4);
// agar last a change krna to enviroent aesa kro kay seecong argument mai bhi v add kro


        // remeber all method starts with lower case

    }


}
