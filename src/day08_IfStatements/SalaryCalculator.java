package day08_IfStatements;

public class SalaryCalculator {

    public static void main(String[] args) {

        int hourlyRate = 50,
                weeklyHours = 45;

        Double stateTaxRate = 6.5, //these are given in percentafes , in order to convert  percentage  into decimaal divide it by 100
                federalTaxRate = 26.2;


//-----------------------------

        int salaryBeforeTax = hourlyRate * weeklyHours * 52;
        //  we have 52 weeks in a year , thats why using it to calculte salary

    double stateTax = salaryBeforeTax * stateTaxRate/100;
    double federalTax = salaryBeforeTax * federalTaxRate/100;
    double totalTax = stateTax + federalTax;
    double salaryAfterTax = salaryBeforeTax - totalTax;

    // gross pay means salary before tax
        // net income means salary aftertax

        System.out.println("Gross pay is :$ "+salaryBeforeTax);
        System.out.println("state tax is : $"+stateTax);
        System.out.println("federal tax is :$"+federalTax);
        System.out.println("Total tax is: $"+totalTax);
        System.out.println("Net income is : $"+salaryAfterTax);





    }


}
/*
3. Create a class called SalaryCalculator.java
			3.1 declare the following variables:
					hourlyRate, weeklyHours, stateTaxRate, federalTaxRate
			3.2 use the given info in above variables to calculate the followings:
					1. salaryBeforeTax
					2. stateTax
					3. federalTax
					4. totalTax
					5. salaryAfterTax
					Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52
			3.3 use print statement to print each of the above
				Ex:
					   hourlyRate = $50
					   weeklyHours = 45
					   stateTax = 6 (given as percentage, you need to convert to decimal)
					   federalTax = 26 (given as percentage, you need to convert to decimal)
				    output:
				    	Gross pay is: $117000
				    	Federal tax is: $30420
			    		State tax is: $7020
			    		Total tax is: $37440
			    		Net income is: 79560
 */