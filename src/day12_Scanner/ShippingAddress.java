package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = scan.nextLine(); // accept enter key


        System.out.println("Enter your building name");
        String buildingName= scan.next(); // ignore enter key

        scan.nextLine(); // due to this enter key aegi
        System.out.println("Enter your Street Name");
        String streetName = scan.nextLine(); // accept enter key

        System.out.println("Enter your city name");
        String cityName = scan.nextLine(); // accept enter key

        System.out.println("Enter your state name");
        String State = scan.next(); // enter key ignore , left in scanner

        System.out.println("Enter your Zip Code");
        String zipCode = scan.next(); // enter key ignore left in scanner
// 2 enter key left in scanner , what if if use next line after this ? do i need to give addtional nextline for enter key ?
// to mjhe abi bhi addtional next line deni hogi for enter

        scan.nextLine();
        System.out.println("Enter country name");
        String countryname = scan.nextLine();

        scan.close();

        System.out.println(fullName + "," + buildingName +""+ streetName+"" +cityName  + State + zipCode);


scan.close();





    }

}
/*
enter
1; full name (nextline)
2; building name (next)
3; street name (nextline)
4;city name (nextline)
5; state (next)
6; zip code (next)

display the shipping address
 */