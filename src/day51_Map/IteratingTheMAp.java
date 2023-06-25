package day51_Map;

import java.util.*;

public class IteratingTheMAp {


    public static void main(String[] args) {

        Map<String,Integer> students = new HashMap<>();
        students.put("Wasta",95);
        students.put("Jiya",86);
        students.put("Taha",80);
        students.put("Jalal",77);
        students.put("Ebbad",95);
        students.put("Ahmed",67);
        students.put("khan",98);
        students.put("Irteza",82);

        // to get all the keys of map use loop and keySet method

        //Set<String> keys = students.keySet();


      /*  for (String eachkey : keys) {
         //   System.out.println(eachkey+": "+students.get(eachkey));

            students.replace(eachkey,students.get(eachkey)+10);
            
        }
*/

        System.out.println("students = " + students);

        Map<String, Integer> earlyBird = new HashMap<>(); // students whose score is >=90
        Map<String, Integer> angryBird = new HashMap<>();// studnts whose score is <90

// u can use keyset method to get all the keys
        // and u can assign it to set
        for (String eachkey : students.keySet()) {

            Integer eachValue = students.get(eachkey);
            if(eachValue>=90){
                earlyBird.put(eachkey,eachValue);
            }else {
                angryBird.put(eachkey,eachValue);
            }
        }

        System.out.println("earlyBird = " + earlyBird);
        System.out.println("angryBird = " + angryBird);


        System.out.println("--------------------");


        //Collection<Integer> score = students.values();
        List<Integer> scores = new ArrayList<>(students.values());// we can use list as well and within the constructor we put value method which returns the collection type and thats how we convert the collection to List
        // benefit of having list it has index number also
// if i dont want to use , i can also use foreeach loop
        System.out.println("scores = " + scores);


        // itterate the map by the value
        // we can also find out in and max score
        // to get all the value using for each loop
        for (Integer value : students.values()) {
            System.out.println(value);
        }


        System.out.println("---------------------");



        int maxScore = Integer.MIN_VALUE;// to find maxScore , to find smallest integeer , find minvalue value
      // than i will compare all the values with this one
        int minScore = Integer.MAX_VALUE;


        for (Integer score : students.values()) {
            if(score>maxScore){
                maxScore=score;
            }

      if(score<minScore){
          minScore=score;
      }

        }

        System.out.println(maxScore);

        System.out.println(minScore);


        System.out.println("-------------");
        //another way to fins max and min number

        int max = Collections.max(students.values());
        int min = Collections.min(students.values());


        System.out.println("max = " + max);
        System.out.println("min = " + min);



  // count how many students has score of 95 or greater
        // u need a variable of count
        //and then check value


        int count = 0;

        for (Integer score : students.values()) {
            if(score>=95){// if score is gretaer or equal to 95 than count incxrease to 1

                count++;
            }
        }

        System.out.println(count);
        // the above task can be done by using the keySet method also
/*
        int count = 0;
        for (String eachKey : students.keySet()) {
            Integer eachValue = students.get(eachKey);

            if(eachValue>=95){
                count++;
            }

        }

        System.out.println(count);
*/



   // if u want to itterate value bu key and value both use entrySet method


        System.out.println("------------------------");


        for (Map.Entry<String, Integer> entry : students.entrySet()) {

        //    System.out.println(entry);
            System.out.println(entry.getKey()+" : "+entry.getValue());
            // only returns u key if u use getkey
// u can get them separately by get key and getValue and also together
        }




    }


}
