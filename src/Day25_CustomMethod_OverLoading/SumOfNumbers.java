package Day25_CustomMethod_OverLoading;

public class SumOfNumbers {


    // if u dont ned to rturn any value use void
    // and when u need to return value use retrun


    public static void main(String[] args) {

      int total=   sumofTwoNumber(100,200);
        System.out.println(total);
        
        int total1 = sumOf3Numbers(100,200,45);
        System.out.println("total1 = " + total1);
        
        
        int total2 = sumOf4Numbers(8,4,5,6);
        System.out.println("total2 = " + total2);

    }

//1. create a method that can find the sum of two numbers
//	                    method name: sumOf2Numbers
public static int sumofTwoNumber(int num1 , int num2){


    return num1+num2;

}

// 2. create a method that can find the sum of three numbers
//	                    method name: sumOf3Numbers
    public static int sumOf3Numbers (int num1,int num2, int num3){

        return num1+num2+num3;
    }


    
    // 3. create a method that can find the sum of four numbers
    //	                    method name:  3. create a method that can find the sum of four numbers
    //	                    method name: sumOf4Numbers
    
    public static int  sumOf4Numbers (int num1 , int num2, int num3, int num4){
        

        
        return   num1+num2+num3+num4;
        
    }





}
/*
Warmup tasks:
	Task1:
	    1. create a method that can find the sum of two numbers
	                    method name: sumOf2Numbers

	    2. create a method that can find the sum of three numbers
	                    method name: sumOf3Numbers

	    3. create a method that can find the sum of four numbers
	                    method name: sumOf4Numbers

 */