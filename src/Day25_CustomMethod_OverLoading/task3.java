package Day25_CustomMethod_OverLoading;

public class task3 {


    public static void main(String[] args) {


        int[] MinNum = {1,2,3,4,5};

        System.out.println(min(MinNum));
    }

//1. create a method that can return the min number from an integer array

    public static int min(int[] array){

        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if(array[i]<min){
                min=array[i];

            }
        }
     return  min;

    }


}

/*
ask 3:
	1. create a method that can return the min number from an integer array

	2. create a method that can return the min number from double array

	3. create a method that can return the min number from long array

	4. create a method that can return the min number from short array

	5. create a method that can return the min number from float array

	6. create a method that can return the min number from byte array


 */