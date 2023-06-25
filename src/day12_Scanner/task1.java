package day12_Scanner;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String result = "";

        System.out.println("How many people you live with");
        int peopleLive = scan.nextInt();
        boolean PeopelLiveWIth = peopleLive < 3 || peopleLive > 3 && peopleLive <=6 || peopleLive > 6;


        if(peopleLive<3 ){
            result = "Live with less than 3 people";
        } else if (peopleLive>3 && peopleLive <= 6) {
            result = "Live with 3 - 6 people";

        }else{
            result = "Live with more than 6 people";
        }

        System.out.println(result);



        scan.close();
    }






    }

/*
1. Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"
 */