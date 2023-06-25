package Day27_WrapperClasses;

public class WrapperClassesMEthod {

    public static void main(String[] args) {

        // parseMethod : convert string to primitve


        String str = "123";

       int num = Integer.parseInt(str);

       // 124// as this will give us int so we can assign it to int variable

        System.out.println(num+1); // 124// as this will give us int so we can assign it to int variable

        System.out.println(str+1);// 1231
        System.out.println("-----------------");



        String str2 = "10.5";


       double num2= Double.parseDouble(str2);// double
        System.out.println(num2+1);// 11.5

    //    these are not auto boxing or unboxing because primitbe we assign to primitvve


        // if u want to find maxValue and Min Value in jaba use this
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("-----------------");
        // if u find min or max value of long primitibe

        long max2 = Long.MAX_VALUE;
        long min2 = Long.MIN_VALUE;
        System.out.println("max2 = " + max2);
        System.out.println("min2 = " + min2);

        System.out.println("-----------------");



        System.out.println("-----------------");

        // if u have string that is equal to true or false we can convert it to boolean

        String str3 =  "True";// if i have anything other than true or false or not true like may be it will give false when use Boolean.Parsemethod

        boolean r1= Boolean.parseBoolean(str3);

        System.out.println("r1 = " + r1);


        System.out.println("-----------------------");

        // Valueof method : convert string to wrapper class

        String s2 = "123"; // convert string to integer wrapper class

        Integer x = Integer.valueOf(s2); // retruns Integer and we can assign it to Integer variable
        Integer y = Integer.valueOf(s2);// the Integer can be asisgn to int also and this is unboxing

        System.out.println(x);
        System.out.println(y);
        // if


        String s4 = "1.5";
        Double z = Double.valueOf(s4);

        System.out.println(z);

        System.out.println("------------------------");

        // Character wrapper class has more method
        // isDigit() : if u have any char value and verify if iyts digit call this method

        char ch1 = 'B';
// isDigit()
       boolean r2= Character.isDigit(ch1); // demands to pass char value
       // isLetter
        boolean r3 =Character.isLetter(ch1);

        //if charcter is either letter or digit use isLetterOrDigit
     // Character.isLetterOrDigit(ch1);
        // if the charcter neither lettter nor digit then itts a spceial character

      boolean r4 = ! Character.isLetterOrDigit(ch1);

        // and we have upper case and upper case letter in asci table
        // if u want to verify if its upper case or lower case , it will tell true or false
        // return is boolean

        boolean r5 = Character.isLowerCase(ch1);


        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);


        System.out.println("-----------------");
        // so now find sum of digits
        // first get acces ti every single charctr from string // apply loop

        // apply each loop by using CharArrray

        String s = "ab1cde245ghk98";

        int sum = 0;

        for(char each : s.toCharArray()){

            if(Character.isDigit(each)){
                sum += Integer.parseInt(""+each); // if u wnat digit to be int use parse method and give "" + each because in parse we have to give string so add "" to make it string
            }

            System.out.println("sum = " + sum);

        }



    }




}
// if data structure not support primitve  use wrapper class
