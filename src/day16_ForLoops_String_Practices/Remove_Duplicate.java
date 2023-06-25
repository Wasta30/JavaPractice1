package day16_ForLoops_String_Practices;


import java.util.Scanner;

public class Remove_Duplicate {


    public static void main(String[] args) {


// aabbaac  == abc is dupliacte 
        // i have to make a condition in which , 
        // the character which is already existed in the string will not come in result 
        // means result = ""; abhi ismai a nae mai a add krskti but uske bad a add na hopae 
        // so we need every single character starting from index zero to last index
        // so charAt method is used , if i have 5 charter in string i have to call charAt method 5 times so us loops 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String str = input.next();            //"AABBCC" or aabbccc;
        String result = "";// ABC or abc
// if use < remove -1 of length method 
        // character only come if not contained in result 


        for (int i = 0; i <= str.length()-1; i++) {
            String ch = ""+str.charAt(i);  // char hata kar string laga do and "" add krdo
            
            if(!result.contains(ch)){// if the character not contained in the result
                result +=ch; // the character will be added to the resul
            }
                
                
        }
// to make char into string add ""
        System.out.println(result);
    }


}
/*

	2. Write a program that can remove the duplicated characters from a String
			Ex:
				input:
					AABBCCBC

				Output:
					ABC

			Hint: You can add each characters of the string into another String
				  Condition: the character is not contained in the other String yet before you are adding
 */