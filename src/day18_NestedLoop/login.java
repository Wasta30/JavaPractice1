package day18_NestedLoop;

import java.util.Scanner;

public class login {


    public static void main(String[] args) {

        // use break statemnt to exit loop

        Scanner input = new Scanner(System.in);
        System.out.println("Enter username");
        String userName = input.next();

        System.out.println("Enter password");
        String password = input.next();



        if (userName.equalsIgnoreCase("wastatar30@gmail.com") && password.equals("Ameen")){
            System.out.println("Logged in");
        }else{ // get three atempt in case of wrong passwod or username

            for (int i = 1; i < 3 ; i++) {
                System.out.println("Incorrect username or password");
                System.out.println("Enter username");
                userName = input.next();

                System.out.println("Enter your password");
                password = input.next();

                if (userName.equalsIgnoreCase("wastatar30@gmail.com") && password.equals("Ameen")) {
                    System.out.println("Logged in");
                    break;// whenever user provide valid credentials exit loop
                }
            }
                if(!(userName.equalsIgnoreCase("wastatar30@gmail.com") && password.equals("Ameen"))){
                    System.out.println("Your account is locked, Please contact support team");
            }

input.close();

        }




    }




}
/*
 2. You are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                            username: Cydeo
                            password: WoodenSpoon

                Ask the user to enter their credentials.
                        If credentials are matched, your program should print "Logged in."
                        If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is locked."

 */