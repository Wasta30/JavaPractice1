package day21;

public class ForEachLoopIntro {


    public static void main(String[] args) {

        // we use forEachloop when use data structure
        // helps us iterate data easily , easier than forloop whileloop and dowhile


        // u will not get infinte loop while using for each loop , it will stop and would not run infinite time
        // how many times forEachloop executes only depends on the data structure

        // first condition for forEachloop is must have a data structure
        // either Arrayb , map , collection
        // so it will executed till the last element of data structure
        // every single data structre has a size so number of execute of forEachloop is equal to length of  data structure

        // iteratiion is fixed (from first to last)
        // i cant reverse it
        // here iteration always start from first , i can start from last or from middle
        // only use if u want to access from first to last
        // it does not have index number in for each loop
        // but still the regular for loop is more powerfull
        // as for loop has index number and we can change order of iteration


        int[] numbers = {10, 20, 30, 40, 50, 60, 70};
        //                0 ,1,2,3...... ( we have index in forloop)


        for (int i = 0; i < numbers.length; i++) {// i : index of the array
            int eachElement = numbers[i];
            System.out.println(eachElement); // whenevr u want to do this type of iteration from first element to last
            // best way is forEachLoop
        }
        System.out.println("-------------------------");
        // FOREACHLOOP

        for (int each : numbers) {// u have to provide a variable also like each
            System.out.println(each);
        }

// loop which is already iterated (ready to use) , and always use in data structure
    }


}
