package day14_String2;

public class StringMethod1 {

    public static void main(String[] args) {

        // trim method is for removing wide space in string


        String str1 = "    batch 10       ";
        // ususally wide spaces are at the begning and end
        // can trim method be able to modified existing string ?no string is mutaible
        // this trim method creates a new string

        str1 = str1.trim(); // assiggn back the variable it will give u new object

        System.out.println(str1);
// the spaces which are not separating the character will be removed
// mtlb start and end k spaces remove honge


        //  indexof = able to pass character , check string and tell u the number of that character

        String str2 = "Cydeo School"; // i want to find out what is the character of index  8
        int n1 = str2.indexOf("h");// 8
        // i can pass it  as a string or as char
// find out the index number of charcater h 

        System.out.println("n1 = " + n1);

        int n2 = str2.indexOf("o");
        System.out.println("n2 = " + n2);


// it will tell me the index number of first o
        // so i can make it unique and put ool so it will tell  me index number of o which is 9


        int n3 = str2.indexOf("ool");
        System.out.println("n3 = " + n3);

        String str3 = "Java Programming Langauge";
        int n4 = str3.indexOf("g ");

        System.out.println("n4 = " + n4);


// this method always return the first letter lekin jese 2 a hon to next wale a k liye sath wale letter bhi rakho takay detect krskay
        //and u can add space also
// if u want to find last g just called last index 
        int n5 = str3.lastIndexOf("g");
        System.out.println("n5 = " + n5);


        System.out.println("------------------------");


        String a = "Java Nova Cava Wawa orange";
        int firstA = a.indexOf("a");
        int lastA = a.lastIndexOf("a");
        System.out.println("firstA = " + firstA);

// from right to left if u want to see apply lastindexnumber

        System.out.println("lastA = " + lastA);
        int secondA = a.indexOf("a ");
        System.out.println("secondA = " + secondA);

        int thirdA = a.indexOf("a C");
        System.out.println("thirdA = " + thirdA);

        //int fourthA = a.indexOf("awa W");

        //  System.out.println("fourthA = " + fourthA);
// we can also solve it by last index method

        //   int fourthA =a.lastIndexOf("av");
        // this last index starts from righ to left and check av and gives us index number of 4th a
//        System.out.println("fourthA = " + fourthA);
// agar tmko index number fins krna lest say Ca mai se a ka to wo tmko C ka index number batayega to tm+1 krky a ka find krskti ho

        int fourthA = a.lastIndexOf("Ca") + 1; // if u find the index number next to C
        System.out.println("fourthA = " + fourthA);

        int fifithA = a.lastIndexOf("va") + 1;

        System.out.println("fifithA = " + fifithA);
        int sixthA = a.lastIndexOf("aw");
        System.out.println("sixthA = " + sixthA);

        int SeventhA = a.lastIndexOf("a ");
        // this will look from right to left and jo a space k sath wo dekhega

        System.out.println("SeventhA = " + SeventhA);

     //   index and last index mai ye farq hai ek left to right se start hota and ek righ to left se







    }


}
