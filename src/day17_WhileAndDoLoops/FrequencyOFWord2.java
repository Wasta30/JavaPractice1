package day17_WhileAndDoLoops;

public class FrequencyOFWord2 {

    public static void main(String[] args) {
        // tell how many times word cat has occured.

        String str = "Cat Cat Dog Dog CAT cAT";
        int frequency = 0;


        for (int i = 0; i <= str.length()-3; i++) {

// in length subtract 3 chracter cuz u want freq of 3 charcater and add 3 in substrinng
            String eachSub = str.substring(i,i+3);
            if(eachSub.equalsIgnoreCase("Cat")){
                frequency++;
            }

        }
// this is the loop for find freq of word

        System.out.println(frequency);


    }


}
