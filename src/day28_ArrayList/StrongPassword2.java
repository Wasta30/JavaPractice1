package day28_ArrayList;

public class StrongPassword2 {
    public static void main(String[] args) {

        // count how many digit upper case lower case characters we have
        String password = "Wasta!2123ok";


        int countUpperCase=0;
        int countLowerCase = 0;
        int countDigits = 0;
        int countSpecialCharcters =0;
// get each character from loop
        for (int i = 0; i < password.length(); i++) {

            char each = password.charAt(i);// applying charAt method to get each charcter of index
            if(Character.isUpperCase(each)){
                countUpperCase++;
            } else if (Character.isLowerCase(each)) {
                countLowerCase++;
            } else if (Character.isDigit(each)) {
                countDigits++;
            }else {
                countSpecialCharcters++;
            }


        }
      /*
        System.out.println("countLowerCase = " + countLowerCase);
        System.out.println("countUpperCase = " + countUpperCase);
        System.out.println("countDigits = " + countDigits);
        System.out.println("countSpecialCharcters = " + countSpecialCharcters);

        */
        boolean hasUpperCase = countUpperCase>0;
        boolean hasLowerCase = countLowerCase>0;
        boolean hasDigit = countDigits>0;
        boolean hasSpecialCharcter = countSpecialCharcters>0;
        
        
        boolean strongPassowrd = password.length()>=8 && !password.contains(" ") && hasUpperCase && hasLowerCase && hasDigit && hasSpecialCharcter;

        System.out.println("strongPassowrd = " + strongPassowrd);



    }












}
