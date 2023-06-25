package day04_Variable;

public class SalaryCalculator {

    public static void main(String[] args) {

        // Hourly Rate, WeeklyHours


        int HourlyRate = 65;
        int WeeklyHours = 45;

        int Salary = HourlyRate * WeeklyHours * 52; // 52 : no of weeks in a year

        // remember always put variable without quote and not in double quote
//  shortcut for printing a variable
       // System.out.println(Salary);
        System.out.println("HourlyRate = $" + HourlyRate);
        System.out.println("WeeklyHours = " + WeeklyHours);
        System.out.println("Salary = $" + Salary);







    }


}
