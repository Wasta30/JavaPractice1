package day21;

public class Items {


    public static void main(String[] args) {

        // if u have three diff array can we merge it ?(which have same length)
        // check the indexes
// for each loop is for one array , we have to use forloop

      //  3. Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};
      // all three have same length so same index numbers

        for (int i = 0; i < items.length; i++) {

            String item = items[i];
            double price = prices[i];
            int itemId= itemIDs[i];


            System.out.println(item+" - "+itemId+"- $"+price);
        }


    }



}
