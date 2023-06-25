package day16_ForLoops_String_Practices;

public class Palindrome {


    public static void main(String[] args) {


        String word = "tibet";
        String reversed ="";

// need a loop for reversing
        for (int i = word.length()-1; i >=0 ; i--) {

            reversed +=word.charAt(i);


        }

        boolean isPalindrome = word.equalsIgnoreCase(reversed);
        System.out.println("isPalindrome = " + isPalindrome);

    }


}
/*
if "Java" = "avaJ" , these are not same so this is not a palindrome
for exam String
"Anna" = "annA"
"Level" = "Level"
Racecar
Mom
 */