package day11_SwitchStatement;

public class NumberOfDaysInAMonth {

    public static void main(String[] args) {
        int year = 2000; // for thr year feb
        int number = 2;
        String result = "";
        // we have to give the pre condition the number should be between 1-12
        if (number >= 1 && number <= 12) {
            switch (number) {
                case 2:// can i create a cond to check if its a leap year so it has 29 days instead 28 days
                    result =  (year % 4 == 0) ? "29 days" : "28 days";

                        // agar leap year hoa to 29 fays print honge wrna 28 day

                    // if divide by 4 and reminder 0 it will be a leap year hmne cond di

                    break;
                case 4:  case 6: case 9: case 11: // this is a or logic without using boolean
                    result=("30 days");
                    break;
                default:// 1,3,5,7,8,10,12
                   result=("31 days");
                    break;
            }
        } else {

            result=("Invalid  number");
        }
        System.out.println(result);
//f block main hmne switch statement ue kiye hain and usmai ternaries use kiye hain
    }


}

/*

	4. NumberOfDays
			28 Days: 2
			30 days: 4, 6, 9, 11
			31 days: 1, 3, 5, 7, 8, 10, 12

			If(1~12){
 */