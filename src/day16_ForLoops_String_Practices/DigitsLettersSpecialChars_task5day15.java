package day16_ForLoops_String_Practices;

public class DigitsLettersSpecialChars_task5day15 {

    public static void main(String[] args) {


        String str = "ABCDEtrq123456) (*&^%$@!";         //"Cydeo12345School!^%#$WoodenSpoon";
        String digit = "";
        String letters = "";
        String specialCharacters = "";


        for (int i = 0; i < str.length(); i++) { // i is the index number from 0 to last index

            char ch = str.charAt(i);  // ch: each charracter that we have in str

            if (ch >= '0' && ch <= '9') {
                digit += ch;
            } else if (ch >= 'A' && ch <= 'Z') {
                letters += ch;

            } else if (ch >= 'a' && ch <= 'z') {
                letters += ch;
            } else { // if the character is neither digit nor letter, then its special character9
                if (ch != ' '){ // if the character is not a space
                    specialCharacters += ch;

                }


            }
        }

            System.out.println("digit = " + digit);
            System.out.println("letters = " + letters);
            System.out.println("specialCharacters = " + specialCharacters);



    }
    }
 // once u hacve the index numbers u can get the char by applying charAt method which will give u characters
