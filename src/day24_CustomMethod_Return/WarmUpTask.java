package day24_CustomMethod_Return;

public class WarmUpTask {


    public static void main(String[] args) {
        initals("Wasta","Tariq");
        System.out.println("---------------------");
        Domain("Wastatar30@gmail.com");// we can use this also see next step

        String[] emails = {"Taha@gmail.com","Wasta@yahoo.com","JiyaT@hotmail.com"} ;
        for (String EachofEmail : emails) {// do u have method which can help u to display domain :yes
            Domain(EachofEmail);//3 times it will execute
        }

        System.out.println("----------------");

        NameOfMonth(6);

        System.out.println("--------------------");
        NameOfTheDay(4);

    }

    //1. Create a method that can display the initials of the Person
    // if there any info need to be given (String first name, last name )
public static void initals(String firstName , String LastName){
    String inital = firstName.charAt(0)+"."+LastName.charAt(0);
    inital = inital.toUpperCase(); // u will gwt initial in uppercase
    System.out.println("inital = " + inital);
}


// 2. Create a method that can display the domain of the email
public static  void Domain(String email){//Cydeo@gmail.com// need gmail only
        // so u need index number

        String domain = email.substring(email.indexOf("@")+1,email.lastIndexOf(".") );
    System.out.println("domain = " + domain);

}

// 3. Create a method that can display the name of the month based on the given number to the method

    public static void NameOfMonth(int month){
        if(month>=1&&month<=12){
            if(month==1){
                System.out.println("Jan");
            } else if (month==2) {
                System.out.println("Feb");
            } else if (month==3) {
                System.out.println("March");
            } else if (month==4) {
                System.out.println("April");
            } else if (month==5) {
                System.out.println("May");
            } else if (month==6) {
                System.out.println("June");
            } else if (month==7) {
                System.out.println("July");
            } else if (month==8) {
                System.out.println("Aug");
            } else if (month==9) {
                System.out.println("September");
            } else if (month==10) {
                System.out.println("Oct");
            } else if (month==11) {
                System.out.println("Nov");
            }else {
                System.out.println("December");
            }
        }else{
            System.out.println("Invalid");
        }

    }


//4. Create a method that can print the name of the day based on the given number to the method

public static void NameOfTheDay(int number){
        String name = "";
        if(number>=1&&number<=7){

            name = (number==1)?"Monday":(number==2)?"Tuesday":(number==3)?"Wednesday":(number==4)?"Thursuday"
                    :(number==5)?"Friday":(number==6)?"Saturday":"Sunday";

        }else {
            System.out.println("Invalid");
        }
    System.out.println("name = " + name);

}


//5. Create a method that can print how many days a month has




    // age group
}
/*
Warmup tasks:
	1. Create a method that can display the initials of the Person

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has


 6. ageGroups
                age groups are:
                        infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12),
                        Teenager (13 - 17),Young Adult (18 - 20),Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)


 */
// void : method just perfrom its task , not possible to use it outside
// paramter : additonal info giving to method