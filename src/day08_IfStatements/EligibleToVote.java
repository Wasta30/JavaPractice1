package day08_IfStatements;

public class EligibleToVote {

    public static void main(String[] args) {

        String name = "Wasta";
        int age = 25;
        String citizen = "USA";

        // find it the Person eligible

        boolean isEligible = age >=21 && citizen == "USA";

if(isEligible){
    System.out.println(name+" is eligible to vote");


}


if(!isEligible){
    System.out.println(name+ "is not eligible to vote");
}

    }





}
