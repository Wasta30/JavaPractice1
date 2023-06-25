package Day26_CustomMethodPractice;

public class RemoveElements1 {


    public static void main(String[] args) {

        int[] numbers = {100,200,300,400,500,600};

        numbers=removeElement(numbers,1);


    }


// in order tp remove specific element from array at specific index need info (array and index)
 //                        {2,3,4,5}                 2 (index :2 so exclude 3)
    public static int[] removeElement(int[] array, int index) {

        if(index<0 || index>array.length-1){
            System.out.println("Invalid index:"+index);
            System.exit(0);
        }
        int[] result = new int[array.length-1];

        int j =0;
        // in the for each loop i do not have access to index num , if i remove one index the duplicated element present also remove so i will use for loop
           // whenver the element given is mathcing with element at given indexin array we can skip it by continue

        for (int i = 0; i < array.length ; i++) {
            if(i==index){// if the index of array is matching with the giben index skip it
                continue;


            }
        result[j++]=array[i];// rest of element assigned it to new arrray
        }

        return result;
    }

    // 2nd solution




}
/*

	2. Create a class named RemoveElements:
			2.1 Create a method that passes two parametetrs: an integer array and an integer index. the method removes the element at the given index of the array and returns the new array
					Ex:
						int[] arr = {10,20,30,40}
						removeElement(arr, 2) ==> {10, 20, 40}

			2.2 Create a method that passes two parametetrs: a double array and an integer index. the method removes the element at the given index of the array and returns the new array


			2.3 Create a method that passes two parametetrs: a char array and an integer index. the method removes the element at the given index of the array and returns the new array

			2.4 Create a method that passes two parametetrs: a String array and an integer index. the method removes the element at the given index of the array and returns the new array



 */