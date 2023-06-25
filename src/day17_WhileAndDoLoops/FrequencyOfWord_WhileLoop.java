package day17_WhileAndDoLoops;

public class FrequencyOfWord_WhileLoop {


    public static void main(String[] args) {


        String str = "Java Java python Python";

        int frequency = 0;
        // delete java until it  gives freq

// as long as the sentence contain java delete java by using replace first method and replace ith with empty string
        // and i want to repate this process until there is no more java left
        // and in order to fing freq of word java i have to count how many times loops gets executed and each time
        // for this i have to increase freq by 1

        while (str.contains("Java")) {
            str = str.replaceFirst("Java", "");
            frequency++;
        }


        System.out.println(frequency);

        System.out.println("----------------------------");


        String str1 = "cat cat cat cat cat cat CAT Cat Cat dog dog dog";
        str1.toLowerCase(); // in ordert to make the sentence lower case
        int countCat = 0;

        while (str1.contains("cat")) {
            str1 = str1.replaceFirst("cat", "");
            countCat++;
        }

        System.out.println(countCat);
// continue to delete cat until there is no more cat
        // using replace first because we are deleting one cat at a time if we used replace we would delete all the cats at the same time
        // each  time we deleted incerase the variable countcat to calculate freq
        // if u want to ignore case just convert sentence in lower case and conpare it with lower case cat

        System.out.println("---------------------");

        // when counting the freq of two words


        String str2 = "Java Java Java Python Python Python";
        int countJava = 0;
        int countPython = 0;

        while (str2.contains("Java") || str2.contains("Python")) {

            if (str2.contains("Java")) {
                str2 = str2.replaceFirst("Java", "");
                countJava++;
            }

            if (str2.contains("Python")) {
                str2 = str2.replaceFirst("Python", "");
                countPython++;

            }
        }

        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);

  // u can also create 2 while loop to count frequency
    }

}
