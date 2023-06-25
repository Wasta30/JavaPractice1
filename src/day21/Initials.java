package day21;

public class Initials {// is first charcter of full name


    public static void main(String[] args) {

        String[] names = {"Wasta Tariq", "Taha Tariq", "Ebbad Raza", "Jiya Taha", "Ameen Uddin", "Javeria Fardan"};
        // i have fiull name , print intials of eveyr student ,
        // so in order to get intials i need acces of all character

        // firts step is to ave acces of each element of array

        for(String each:names){
            String intials = each.charAt(0)+"."+each.charAt(each.indexOf(" ")+1);
            System.out.println(intials);



    }
}
}
