package day28_ArrayList;

public class StrongPassword {
    public static void main(String[] args) {


        String password = "Cydeo1990@"; // consider it a strong password

        // create a boolean condition for the passowrd

//  1. Password MUST be at least have 8 characters long, and should not contain space

        boolean r1 = password.length() >= 8 && !password.contains(" ");


        // i will use loop to check lower case upper case special charcter and digit (i need to check every single charcter)
        // so i need to create loop for all this 4 cond
        boolean r2 = false; // has upper case letter , only time it chages to truw when its has upper case ltter
        boolean r3 = false;// lowe case
        boolean r4 = false;// special chraxter
        boolean r5 = false;// digit


        // we can appply for each by usijng charArrya

        char[] chars = password.toCharArray(); // convert char to array


        for (char each : chars) {// get eacg char of passowrd
            if(Character.isUpperCase(each)){
                r2 = true;
            } else if (Character.isLowerCase(each)) {
                r3 = true;
            } else if (Character.isDigit(each)) {
                r5 = true;
            }else{
                r4 = true;
            }

        }

        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;

        System.out.println("isStrongPassword = " + isStrongPassword);

    }



    public static boolean strongPassword (String password){
        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false; // has upper case letter , only time it chages to truw when its has upper case ltter
        boolean r3 = false;// lowe case
        boolean r4 = false;// special chraxter
        boolean r5 = false;// digit

        char[] chars = password.toCharArray();


        for (char each : chars) {// get eacg char of passowrd
            if(Character.isUpperCase(each)){
                r2 = true;
            } else if (Character.isLowerCase(each)) {
                r3 = true;
            } else if (Character.isDigit(each)) {
                r5 = true;
            }else{
                r4 = true;
            }

           /* if(r1 && r2 && r3 && r4 ){
    break;

}*/
        }

        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;
  return isStrongPassword;
    }


}


/*
  Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lower case letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit

 */