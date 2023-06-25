package Day25_CustomMethod_OverLoading;
import utilities.StringUtility;
public class Test {


    public static void main(String[] args) {

        String str = "Java Programming Langauge";

        StringUtility.printEachChar(str);
// this String utility class has method which is printEachchar



        String str1= "Wasta you are love";
      String reverse =  StringUtility.reverse(str1); // assign it to another string cuz retrun method
        System.out.println(reverse);
// return method returns u the value u can assign it to variable and re use or u can just put it in print statement

        System.out.println("---------------------");

        String word = "Level";
        boolean palindrome= StringUtility.isPalindrome(word);
        System.out.println("palindrome = " + palindrome);
        System.out.println("-----------------------");
        // check how many   palindrome  we ve in string  array
        String [] names = {"Level","Civic","Anna","Java","racecar"};
        // check every sinngle element of this array
        int count = 0; // this time we dont use nested loop
        for(String each : names){
            if(StringUtility.isPalindrome(each)){
                count++;
            }
        }
        System.out.println(count);


        System.out.println("--------------");

        String s1 = "aaaaaaaaaaabbbbbbbcccccc";
        String noDuplicate = StringUtility.removesDuplicate(s1);
        System.out.println(noDuplicate);

    }


}
