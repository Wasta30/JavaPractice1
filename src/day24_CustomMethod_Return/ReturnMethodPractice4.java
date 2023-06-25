package day24_CustomMethod_Return;

public class ReturnMethodPractice4 {


    public static void main(String[] args) {
        String str = "aaabbccddee";
        str=removeDuplicate(str);
        System.out.println(str);
    }

public static String removeDuplicate(String str) {//"aaabbbccc"=
    // get everysingle character of string and add in to another string in the cond if the charcter is not already in that string
    String result = "";
    // create a loop that can give u everysingle character of string
    for (int i = 0; i < str.length(); i++) {
        //so in order to get each character of string call CharAt method

        char each = str.charAt(i);
        // so if charcter not contained in string
        // if result doesnot contain charcter that char will be added to result
        if (!result.contains("" + each)) {// make char string because we need to put string here
            result += each;// then add character to result
        }
    }

return  result;
}


}
//1. create a method that can remove duplicated characters from a string and returns the new value