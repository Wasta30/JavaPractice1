package day14_String2;

public class StringMethod3_subsString {

    public static void main(String[] args) {


        // two forms of substring method
        // used for creating sub value for string
        // first form provide begning and ending index numnbers

        // substring*beginning index, endingindex)


        String word = "Cydeo School";
        //             012345......

      String brand =  word.substring(0,4+1); // is string ko brand ka name de diya
// 4 means it will end at e because jo last index dainge us se ek character pgele end hoga
        // agar 0,4 denge to answer cyde hoga so add 4+1
        System.out.println(brand);
        // now i want to get another part of string which is school anf assign it to variable str1
       // what should ne my begniing index ? abi count krlo

    //    String str1 = word.substring(6,11+1); is tarah bhi krskte
        // lekin agar apko end tk change krna to kuch dene ki need nae hoti

        String str1 = word.substring(6);
        System.out.println(str1);


// the only time u need to add +1 when not ending string till end and beech main end krna koi word
      // in substrinf ending index always exlcuded
        System.out.println("-------------------------");
        String word2 = "Python C# Ruby";

        String s1 =  word2.substring(0,word2.indexOf(" "));   // give func that give me index num of this space/character use indexmethod     //java
       // and maine " " dia to before space wale sb space miljainge
        // hamesha second word space k bad hy ata haai to hm space+1 krskte bain
        // " "+1 aese
        String s2 = word2.substring(word2.indexOf(" ")+1,word2.lastIndexOf(" "));
       // last space k liye last space method use kia
        String s3 = word2.substring(word2.lastIndexOf(" ")+1);
      // last space k liye end end index nae dia and begining index jo tha usmai lastindex apply krky +1 kia takay L se start ho


        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);



        System.out.println("----------------------");



        /*
        1. Write a program that can gte the domain of the email. ( Assume that a valid email is given)

		Ex:
			email = Cydeo.School@gmail.com

		output:
			gmail


			email = "School.Cydeo@yahoo.com

		output:
			yahoo


anything between @ and between . is called the domain of email


         */











    }




}
