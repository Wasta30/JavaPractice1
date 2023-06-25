package day37_Inheritance.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {

       Iphone iphone = new Iphone("Iphone 12","6.7 inches",1000,"White");
        Samsung samsung = new Samsung("galaxy S19","6 inches",900,"Black");
        Nokia nokia = new Nokia("Brick","4 inches", 50,"Gray");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        System.out.println("-------------------");
        iphone.call(911);
        iphone.text(123456);

        System.out.println("------------------------");
        samsung.call(9060);
        samsung.text(393518557);
        samsung.freeze();


        System.out.println("------------------");


        nokia.call(5656);
        nokia.text(54789);
        nokia.selfDefense();
        System.out.println("---------------");

        System.out.println(Iphone.hasBattery);
        System.out.println(Samsung.hasBattery);
        System.out.println(Nokia.hasBattery);
        System.out.println(Phone.hasBattery);
    }





}
