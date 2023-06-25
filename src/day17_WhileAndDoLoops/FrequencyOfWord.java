package day17_WhileAndDoLoops;

public class FrequencyOfWord {

    public static void main(String[] args) {

// findinf freq of words


        String str = "JavaJavaJavaJavaJava";

        int frequency =0;

// doing -4 here because java has 4 chaaracters and it will start from 0 to and stop at 4
        // we will use substring here and start from 0 and end till i+4
        // then we make and string eachSub that has
        // when i=0+4=4, i=1+4=5, i=2+4=6, i=3+4 = 7, i=4+4
        // so i value can not be 5,6,7
        for (int i = 0; i <=str.length()-4 ; i++) {// the laast index is excluded so -3
            String eachSub = str.substring(i,i+4);// if u are adding 4 here so means it will look for 4 character and that 4 character we compare it with java
// and if it is equal increase freq by 1
            if (eachSub.equals("Java")){
                frequency++;
            }


        }
        System.out.println(frequency);


    }


}
/*
2. write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "JavaJavaJava";

            output: 3


           	Str = "JavaJava";

           		substrings:
           			1. Java  //substring(0, 4)
           			2. avaJ  //substring(1, 5)
           			3. vaJa  // substring(2, 2+4 )
           			4. aJav  // substring(3, 3+4)
           			5. Java  // substring(4, 4+4)



        	Str = "Java Java Java Python"

        		Delete 1st Java:
        				" Java Java Python"

				Delete 2d Java:
						" Java Python"

				Delete 3rd Java:
						"  Python"
 */
/*

        	Str = "Java Java Java Python"

        		Delete 1st Java:
        				" Java Java Python"

				Delete 2d Java:
						" Java Python"

				Delete 3rd Java:
						"  Python"

// u will continue to delete the word java in order yto find freq of that word
and count how many time u deleted it , i deleted java 3 times and 3 is the freq of java
 */