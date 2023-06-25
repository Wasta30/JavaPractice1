package day12_Scanner;


import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the speed limit");
        int SpeedLimit = scan.nextInt();
        boolean validSpeedLimit = SpeedLimit <=55;


        String result = "";

        if(SpeedLimit<=55){
            result = " ";
        }else{
            result = " You're driving 50 mph over the limit. Slow down!";
        }
        System.out.println(result);


        scan.close();

    }
}
/*
2. Write a program for the speed check. a variable named speedLimit is given and assigned, ask user to enter the current speed, if the current speed is over the speedLimit print slow down, otherwise do not print anything
        Ex:
            speedLimit = 55;
            Enter current speed:
            105

            output:
            You're driving 50 mph over the limit. Slow down!

 */