package day24_CustomMethod_Return;

public class ReturnMethod3 {

    public static void main(String[] args) {

        String str = "aaabccdee";
        // can i  repeat this step to find freq of every single  character and not only 'a'
     //  int freq= frequency(str,'a');// if retrun type int i can assign  it to int

        for (int i = 0; i < str.length() ; i++) {
            int freq = frequency(str,str.charAt(i));// so now we can find freq of every singlee characer
       // and unique cgarcter frew is 1

            if(freq==1){
                System.out.println(str.charAt(i));
            }

        }





    }



                        //      "aaa"    'a' // compare tis char to every single charcter of string
public static int frequency(String str, char ch){// how can i find out a char is occured in string
   // from string create toCharArry which retrutns char array  and then u can call for each loop

    int count = 0;

    // if each character of string matching with char means that charcter is  occured

    for(char each:str.toCharArray()){
        if(each==ch){// then the count will increase
            count++;// in order to find freq of ch compare it with each charcter of string and whencer its matching increase count
        }
    }
    // and in ordeer to find it if its unique i neeed to use this data later on so use return method
    // thats why retrun type is int
    return  count;
}




}
// unique charcter