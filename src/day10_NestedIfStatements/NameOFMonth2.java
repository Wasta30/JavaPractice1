package day10_NestedIfStatements;

public class NameOFMonth2 {

    public static void main(String[] args) {

        /*
          int number = 5;
        String result = ""; // intialzie the vairable pls give some temp value like "", or java anything

        if (number <= 1 && number >= 12) { // if number is valid is range mai hona chahye
          if(number == 1){
              result = "January";
          } else if (number == 2) {
              result = "feb";
          } else if (number==3) {
              result = "March";

          } else if (number == 4) {
result= "April";
          }else if (number == 5) {
              result= "May";
          }else if (number == 6) {
              result= "June";
          }else if (number == 7) {
              result= "July";
          }else if (number == 8) {
              result= "August";
          }else if (number == 9) {
              result= "September";
          }else if (number == 10) {
              result= "October";
          }else if (number == 11) {
              result= "november";
          } else{
              result= "December";
          }
        }else {// if not valid
      result= "Invalid";
        }

        System.out.println(result);
         */



        int n = 5;
        String result =(n == 1)? "Jamuary" :(n == 2)? "Feb":(n==3)? "March":(n==4)?"April"
                :(n == 5)?"May":(n==6)?"June":(n==7)?"July":(n==8)?"August"
                :(n==9)?"September":(n==10)?"October":(n==11)?"November"
                :"December"; // () not required but must apply it
        // the sad face show else if lol
        System.out.println(result);






    }




}
