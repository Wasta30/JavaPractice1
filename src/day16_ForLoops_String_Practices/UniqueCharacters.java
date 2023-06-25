package day16_ForLoops_String_Practices;

import java.util.Scanner;

public class UniqueCharacters {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word");
        String str =  input.next();             //"aaabcc"; // find the unique character
        String result = "";
        // apply index and last index method agar dono same hain to unique hoga
        // aaabcc
        //   0      indexof      ==     2 means its not unique  (last index)
        // a             ==        a

// once u hacve the index numbers u can get the char by applying charAt method which will give u characters
        for(int i = 0; i <= str.length()-1 ; i++){//i: index numbers of str (starting from 0)

            char ch = str.charAt(i);
            if(str.indexOf(ch) == str.lastIndexOf(ch)){ //if the first and last index numbers of the character are same, then the character is unique
                result += ch;
            }


        }


        System.out.println(result);


    }

}
/*

	3. Write a program that can return the unique characters from a String

			Ex:
				input:
					AABCCD

				output:
					BD   // unique means that only appear one time

			Hint: You will need indexOf() and lastIndexOf()
				  if the first and last index numbers of the character are same, then it's unique



				  indexOf('A') ==> 0
				  lastIndexOf('A') ==> 1


				  indexOf('B') ==>2   // means if a character never occur at different index it is unique
			// it means agar index and last index same ho
			 	  lastIndexOf('B') ==> 2


 */