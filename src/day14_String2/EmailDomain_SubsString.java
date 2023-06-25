package day14_String2;

public class EmailDomain_SubsString {

    public static void main(String[] args) {

         /*
        1. Write a program that can gte the domain of the email. ( Assume that a valid email is given)
		Ex:
			email = Cydeo.School@gmail.com
		output:
			gmail

			email = "School.Cydeo@yahoo.com

		output:
			yahoo
anything between @ and between . is called the domain of email
*/

        String email = "Cydeo.School@gmail.com";

        // get domain from email , one thing is sure every single domain is between @ and .
        // find index number of @ , and i can give it beginig number

        int beginningIndex = email.indexOf("@") + 1;
        int endingIndex = email.lastIndexOf(".");
        // index number is an integer number

        String domain = email.substring(beginningIndex, endingIndex);

        System.out.println(domain);

        System.out.println("-------------------------");

        String str1 = "Java is fun, Java is cool , I love Java";

        String s1 = str1.substring(0, 10 + 1);

        System.out.println(s1);


        int beg = str1.indexOf(" J") + 1;
        int end = str1.lastIndexOf(",");

        String s2 = str1.substring(beg, end);

        System.out.println(s2);


        String s3 = str1.substring(str1.lastIndexOf("I"));

        System.out.println(s3);
    }


}
