package day10_NestedIfStatements;

public class GradeReport {

    public static void main(String[] args) {

/*
 90 ~ 100: Excellent
        80 ~ 89: Great
        70 ~ 79: Good
        60 ~ 69: Passed
        0 ~ 59: failed
      **  the pre cond is the score must be between 0 to 100
 */

        int score = 95;
if(score >= 0 && score <= 100){ // if score is valid , 5 possibilites are there
    // grade could be A,B,C
    if(score>=90){ // if this condition it false when score less than 90
        System.out.println("Excellent");
    } else if (score >= 80) {// false : if score less than 80
        System.out.println("Great");
    } else if (score >=70) {
        System.out.println("Good");
    } else if (score>=60) { // i dont have to write that score is less than = to 70 cuz in the last step its already given
        System.out.println("Passed");
    }else{
        System.out.println("Failed");}
}else{ // if the score is not valid
    System.out.println("Invalid Score");
}
        System.out.println("---------------------");
// just give temporary variable in order to wirte in

        String result= "";  // give a string like this with two double quote
   //     // temporary variabe for containg data for every single block , and every single block trying to print string
        // i wanted to assign excellent , good, great to this string variable


        if(score >= 0 && score <= 100){ // if score is valid , 5 possibilites are there
            // grade could be A,B,C
            if(score>=90){ // if this condition it false when score less than 90
                        result = "Execellent";
            } else if (score >= 80) {// false : if score less than 80
              result ="Great";
            } else if (score >=70) {
               result = "Good";
            } else if (score>=60) { // i dont have to write that score is less than = to 70 cuz in the last step its already given
                result = "Passed";
            }else{
                result =  "Failed";}
        }else{ // if the score is not valid
            result = "Invalid Score";
        }

        System.out.println(result);  // now just print the result
// so in this one i used only one print statement
    }


}
