package day24_CustomMethod_Return;

public class ReturnMethodPractice2 {

    public static void main(String[] args) {
      String grade=  grades(80);

      if(grade=="A"){
          System.out.println("Excellent");
      } else if (grade=="B") {
          System.out.println("Great");
      } else if (grade=="C") {
          System.out.println("Good");
      } else if (grade=="D") {
          System.out.println("Fair");
      } else {
          System.out.println("Failed");
      }


    }





public static String grades(int score){

    String result ="";


    if(score<0 || score>100){// invalid
        result="Invalid";
    }else {
        result= (score>=90)?"A":(score>=80)?"B":(score>=70)?"C":(score>=60)?"D":"F";

    }
return result;


}



}
//create a function that can calculate the grade
 /*
            check the grade:
                'A' ====> Excellent
                'B' ====> Great
                .....
         */