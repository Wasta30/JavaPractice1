package Day25_CustomMethod_OverLoading;

import utilities.ArraysUtility;

public class Test2 {

    public static void main(String[] args) {
        // only using this class for custom method for containers

        int[] arr1 = {1, 2, 3, 4, 5};
        ArraysUtility.printEachElement(arr1);

        System.out.println("--------------");

        double[] arr2 = {1.1, 2.4, 5.6, 7.8};
        ArraysUtility.printEachElement(arr2);

        System.out.println("----------------------");

        char[] ch = {'A', 'B', 'C', 'D'};
        ArraysUtility.printEachElement(ch);

        System.out.println("-------------------------");
        String[] str1 = {"Wasta", "Jiya", "Taha"};
        ArraysUtility.printEachElement(str1);

        System.out.println("-----------------------");
        // maximum number(integer)

        int[] n1 = {1, 2, 3, 4, 10};
        int max1 = ArraysUtility.max(n1);

        System.out.println("max1 = " + max1);

        System.out.println("---------------------");


        double[]n2= {1.2,4.5,100.5};
        double max2 = ArraysUtility.max(n2);
        System.out.println("max2 = " + max2);


        System.out.println("---------------------");
        
        int [] a1 = {1,2,3,4,5,6,7};
        
        boolean r1= ArraysUtility.contains(a1,14);
        System.out.println("r1 = " + r1);
        
        

        
        
        
        
    }
    
    
    
    
    

}
