package day15_For_Loops;

public class Alphabet {

    public static void main(String[] args) {
        // A~Z , these are character in ASCII table
        // i can apply relational operator(> < >= <= )to the char because every char has a number
        // u can not apply relational to string
        // A~Z ====> 65~90 // but 65-90 print number
        // so i have to cast it to char


        for (int i = 65; i <= 90; i++) {
            System.out.print((char) i + " ");
        }


        System.out.println();

        System.out.println("-----------------------------");


        for (char i = 'A'; i <= 'Z'; i++) {// i=A,B,C,D....Z
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("--------------------------");
// a~z
        for(char i = 'a'; i <='z';i++){
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("------------------------");

        // Z~A
//start is Z and end is A , so go backwards , so i--,

        for (char i = 'Z'; i>='A';--i){// >= greater eqaul to A
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("------------------");


        // a~z
        for(char i='z'; i >= 'a';i--){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("-------------");


        // first 40k character print on console (Ascii table)

        for(char i=1; i<=40000; i++){// first 40k char character
            System.out.print(i+"");
        }


    }


}

        /*
        A~Z
        a~z
        Z~A
        z~a
         */
