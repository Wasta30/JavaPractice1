package day11_SwitchStatement;

public class Grade2 {

    public static void main(String[] args) {
// we can not apply AND logic in switch statement

        char ch = 'A';
        String result ="";
        switch(ch){//  whenver u apply or logic use case back to back

            case 'A': case 'B': case 'C': case 'D':  // also write like this
                result = "Passed";
                break; // we are not using OR  cuz it not accept boolean
            case 'F':
              result = "Failed";
              break;

            default:
                result = "Invalid";
              // if the character is not A,B,C,D,F if its E what we can do ?
// in which senairo its failed ? In case of F make one case F

        }

        System.out.println(result);



    }




}
/*
if the grade is A,B,C, or D giveme result passed otherwise failed
 */