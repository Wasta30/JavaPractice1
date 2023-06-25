package day17_WhileAndDoLoops;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username");
        String username = scan.next();


        System.out.println("Enter your password");
        String password = scan.next();


        if(username.equals("wastatar30@gmail.com")&& password.equals("Ameen92")){
            System.out.println("Logged in");
        }else {// this will execute when user name and passowrd is incorrect
            int attempt = 3; // then user gets three atempts thats why declare this variable under this
            // the only time user able to re enter crediantials is when user or pass invalid or user still has attempt
           while (!(username.equals("wastatar30@gmail.com")&& password.equals("Ameen92") )&& attempt>0){ //
               System.out.println("Incorrect username or password, please re-enter");
               System.out.println("Enter your username");
               username = scan.next();

               System.out.println("Enter your password");
               password = scan.next();
               attempt--;
           }
        }


        if(username.equals("wastatar30@gmail.com")&& password.equals("Ameen92")){
            System.out.println("Logged in");
        }else{
            System.out.println("Your account is locked");
        }

        // u have 3 attempt if  all three attempt are failed u need to print ur account is locked







    }



}
/*
2. You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is locked."



 */