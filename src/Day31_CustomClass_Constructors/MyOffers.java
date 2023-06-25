package Day31_CustomClass_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {

    public static void main(String[] args) {




        Offer offer1=   new Offer();
        Offer offer2=   new Offer();
        Offer offer3=   new Offer();
        Offer offer4=   new Offer();
        Offer offer5=   new Offer();
        Offer offer6=   new Offer();
        Offer offer7=   new Offer();


        offer1.setInfo("101 Bay view street,US","Cydeo","SDET",2500,true,false,true,true);
        offer2.setInfo("Gulshan e iqbal block 4 , Karachi","OneTen","Software Engineer",2000,false,false,false,false);
   offer3.setInfo("Turin","BLA","Teacher",3000,true,true,true,true);
   offer4.setInfo("Turin","Lily","SDET",2500,true,true,true,true);
   offer5.setInfo("Milam","Toyota","CSR",1500,false,false,false,true);
    offer6.setInfo("Turin","Maserati","Engineer",2700,true,true,false,true);
    offer7.setInfo("Corso lecce 32 , Turin","Fiat","Manager",4000,true,true,false,true);


        System.out.println("offer1 = " + offer1);
        System.out.println("offer2 = " + offer2);
        System.out.println("offer3 = " + offer3);
        System.out.println("offer4 = " + offer4);
        System.out.println("offer5 = " + offer5);
        System.out.println("offer5 = " + offer5);
        System.out.println("offer6 = " + offer6);
        System.out.println("offer7 = " + offer7);


        System.out.println("------------------------");

    //2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
        //						2.3.1 Write a program that can remove the offer objects that are not full-time


        Offer[] myOffers = {offer1,offer2,offer3,offer4,offer5};

        // how to make sure it only contain if offer is only full time ( use remove if)
        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers));
        fullTimeOffers.removeIf(p->!p.isFullTime); // if offer not full time

        System.out.println(fullTimeOffers.size());

    ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myOffers));
localOffers.removeIf( p->!p.location.equals("Turin"));

        System.out.println(localOffers.size());


        for (Offer localOffer : localOffers) {
            System.out.println(localOffer.companyName+":"+localOffer.salary);
        }








    }




}
/*
2. Create a class named MyOffers:

				2.1 Create 7 objects of Offer
				2.2 Create an array of Offers named myOffers and store all 7 objects of offers
				2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
						2.3.1 Write a program that can remove the offer objects that are not full-time
				2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
						2.4.1 Write a program that can remove all the offers that are not from local
				2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
						2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
				2.6 Create an ArrayList of Offer named sdetOffers and add all the offer objects.
						2.6.1 Write a program that can remove all the offers that are not for SDET
				2.7 Create an ArrayList of Offer named offersWith100K and add all the offer objects.
						2.7.1 Write a program that can remove all the offers that are offering less than 100K salary

 */