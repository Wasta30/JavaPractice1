package day10_NestedIfStatements;

public class Task6 {


    public static void main(String[] args) {

        int salary = 75000;
        int creditScore = 680;



        String result = (salary>60000 && creditScore> 620)?"Loan Approved":"Loan Denied";

        System.out.println(result);


int x= 10;
int y = x++;
        System.out.println(y++);


    }
}
/*
6. Create a class called Loans, Given two variables salary and credit score, use those given info to determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise print: "Loan Denied"

              NOTE: MUST USE TERNARY.
 */