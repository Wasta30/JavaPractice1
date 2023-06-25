package day51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {
    public static void main(String[] args) {

        // student name and score of studennt
        // to increase size of the map or in other wors when u wan to add

        Map<String,Integer> students = new HashMap<>();
        students.put("Wasta",95);
        students.put("Jiya",86);
        students.put("Taha",80);
        students.put("Jalal",97);
        students.put("Ebbad",95);
        students.put("Ahmed",97);
        students.put("khan",98);
        students.put("Irteza",92);

        System.out.println(students.size());



        // display of score of wasta
        // the key here is the string
        System.out.println(students.get("Wasta"));


        //replace method
        // replace score of wasta to 90
        students.replace("Wasta",90);

        System.out.println(students);


        // remove method
        // if u want to decrease size oof map
        // provide key and value will be removed at thwe same time
        // remove jiya

        students.remove("Jiya");
        System.out.println(students.size());
        System.out.println(students);

// remove and put is opposite
        //put : to add
        // remove : to remove


        // contains key

        boolean r1 = students.containsKey("Ebbad");
        System.out.println("r1 = " + r1);// true , because our map contains this key 
        
        
        boolean r2 = students.containsValue(97);
        System.out.println("r2 = " + r2);
        
        
        boolean r3 = students.containsKey("Nehal");
        System.out.println("r3 = " + r3); // false
        
        
        //isEmpty method
        System.out.println(students.isEmpty()); // if size not zero it gives false


        //


        System.out.println("--------------------------");
        
        Map<String , Integer> map1 = new HashMap<>();
        // if i want to put all the value of student map into these map use putAll method
        map1.putAll(students);
        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(students);


        System.out.println("map1 = " + map1);
        System.out.println("map2 = " + map2);

        System.out.println(map1==map2);// this will give use false because there are two object , everytime a new keyword is used its a different object
        // so if u want to compare two maps use equal method

        System.out.println(map1.equals(map2));// now it returns use true


        // clear method remove everything key and value

        map1.clear();
        map2.clear();
        System.out.println("map1 = " + map1);
        System.out.println("map2 = " + map2);







    }





}
