package day09_IfStatements;

public class MaxAndMinNumbers {
    public static void main(String[] args) {


        // 1. Maximum number between two different numbers

        int n1 = 10;
        int n2 = 20;

        if (n2 > n1) {
            System.out.println(n2 + " is the maximum number");
        } else {
            System.out.println(n1 + " is the maximum number");

        }


        // 2. Minimum number between two different numbers

        int num3 = 20;
        int num4 = 40;

        if (num3 < num4) {
            System.out.println(num3 + " is the minimum number");
        } else {
            System.out.println(num4 + " is the minimum number");
        }

        // 3. Write a progrm that can check if the Person is eligible to buy alcohol

        int age = 19;

        boolean isEligible = age >= 19;

        if (isEligible) {
            System.out.println("Eligible to buy alcohol");
        } else {
            System.out.println("not eligible");
        }

//4. Write a progrm that can check if the Person is eligible to vote

        int ageForVote = 22;

        if(ageForVote >=23){
            System.out.println("Eligible to Vote");
        }else{
            System.out.println("Not eligible to Vote");
        }


    }
}
