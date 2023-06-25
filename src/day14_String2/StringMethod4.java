package day14_String2;

public class StringMethod4 {


    public static void main(String[] args) {


        String str = "Cydeo";
        // if i want to repeat this steing use repeat method


        str = str.repeat(4); // this will print 4 times

        // or i can massign it to another variable 
        // String str2 = str.repeat(4);
//cydeocydeocydeocydeo
        System.out.println(str);

        String s1 = "Wooden Spoon";
        // if u want to give space between words give space between lasr word to double quote
        String s2 =s1.repeat(100);

        System.out.println("s2 = " + s2);

        System.out.println("-----------------------------------");

        // i can also repeat print method also

        System.out.println("WASTA\n".repeat(20));

        // charAt,length,trim,replace,subsstring mostly used

        // u can also create space in doublee quote also like this

        String name = "Java";
        System.out.println((name+" ").repeat(50));

    }


}
