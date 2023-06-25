package day20_Arrays;

import java.util.Arrays;

public class task1 {

    public static void main(String[] args) {
        
        String [] classmates = {"Taha Ta","Wasta Ka","Jiya Ma","Ameen Uddin","Jalal naeem"};

      /*  classmates [0] = "Taha Ta";
        classmates[1]= "Wasta Ka";
        classmates[2]= "Jiya Ma";
        classmates[3]= "Ameen Uddin";
        classmates[4]= "Jalal naeem";*/

for(String intial:classmates){
    String intials = intial.charAt(0)+"."+intial.charAt(intial.indexOf(" ")+1);

    System.out.println(intials);

}
        
        
        
        
        
        
    }
    
}
/*
1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines

 */