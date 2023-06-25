package day19_LoopPRactices;

public class FrequencyOfCharacters {


    public static void main(String[] args) {


        String str = "aabccd";
        String result = "";
        // find how to get fiest haracer from string use cgarAt and gibvbe 0
        // whwnever a character mathcing i need to count the freq/ (increase freq


        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j); // each character from string
            int count = 0;

            for (int i = 0; i < str.length(); i++) {// to find freq of each character
                char eachCharcter = str.charAt(i);
                if (ch == eachCharcter) {
                    // ch is freq of charcter
                    count++;
                }


            }
       if(result.contains(""+ch)){
           continue; // if the charcater already in result skip add ing that character
       }// qk agar ye nae kia to a2a2b1c2cw2 kkry answer araha tha to ye krna zaruri tha

            result+=ch;// concate ch and also concate freq in result
            result+=count;




        }
        System.out.println(result);
    }
    }
/*
Tasks:
	1. Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1
 */