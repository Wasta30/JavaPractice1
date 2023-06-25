package day17_WhileAndDoLoops;

public class FrequencyOfCharacter {
// this program gives freq of any charcater string
    public static void main(String[] args) {
// find the freq of one character
        String str = "AAABBBCAAAAA";
        char ch = 'A'; // how many times it appread in string

        // everytime when the character A is matching with str the frequency increases by +1
        int frequency = 0; // +1+1+1 cuz three times A is there


        for (int i = 0; i < str.length(); i++) { // i : indexes of str

            char eachCharacter = str.charAt(i); // eachChar : each character of str

            if(ch == eachCharacter){ // if given ch is matching with eachCharacter, then ch is appered in string and at that  point i have to increase the frequency by 1
                frequency ++; // same as frequency +=1;

            }


        }

        System.out.println(frequency);

    }


}
/*
1. Write a program that can return the frequency of a char from a String

			Ex:
				str = "AAABBBC"
				ch = 'A'

			Output:
				3
 */
// char does not have euqlans and ignorecase method