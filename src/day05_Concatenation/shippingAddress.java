package day05_Concatenation;

public class shippingAddress {


    public static void main(String[] args) {

// there are two ways of writing string one with ; and it will end the string if u want to contiune it use ,


        String name = "Wasta Tariq",
                buildingNumber = "228",
                streetName = " Via berta",
                city = "Grugliasco",
                state = "Turin",
                zipCode = "10095";

        // System.out.println(name + "\n" + buildingNumber + ""+ streetName + "\n" + city + "," + state + " " +zipCode);

        String address = name + "\n" + buildingNumber + "" + streetName + "\n" + city + "," + state + " " + zipCode;
        System.out.println(address);


    }


}

/*
Create a class called ShippingAddress.java
2. Declare the following variables:
1. name
2. buildingNumber
3. streetName
4. city
5. state
6. zipCode
3. Use concatenation to print the full address
 */