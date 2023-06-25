package day20_Arrays;

public class UniqueElements {

    public static void main(String[] args) {


        String [] words = {"Java","Java","Java","Python","C#"};

        // what are the uniqe elements ?
        // the only way to find freq of all elements
        // the outer loop select the specific word and that word will be compared to inner loop

        for (int j = 0; j < words.length; j++) {

            // i will comapre one element with all the element and when that element occur thr freq will increase
            String element = words[j]; // this is just for one element so repeat them
           // need to pass diff index number , need one more loop
            int freq = 0;

            for (int i = 0; i < words.length; i++) {
                if(words[i].equals(element)){
                    freq++;
                }
            }

            if(freq==1){// whichever elemnt freq =1 that element will be printed
                System.out.println(element);
            }

        }




        // so the outer loop holds one element an dinner loop goinf to see if its occurs or not


    }



}
