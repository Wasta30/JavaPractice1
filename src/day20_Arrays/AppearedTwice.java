package day20_Arrays;

public class AppearedTwice {


    public static void main(String[] args) {


        char[] ch = {'A', 'A', 'C', 'D', 'C', 'E', 'E'};


        for (int j = 0; j < ch.length; j++) {
            char eachCharcter = ch[j];
            int freq = 0;
            for (char i = 0; i < ch.length; i++) {
                if (ch[i] == eachCharcter) {
                    freq++;
                }

            }


            if(freq==2){
                System.out.println(eachCharcter);
            }


        }

    }


}
