package day51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {

    public static void main(String[] args) {


        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        //  1. Update the "M" to Male and "F" to Female

/*
        for (String key : employeeMap.keySet()) {
            if(employeeMap.get(key).equalsIgnoreCase("m")){
                employeeMap.replace(key,"Male");
            }


            if(employeeMap.get(key).equalsIgnoreCase("f")){
                employeeMap.replace(key,"Female");
            }

        }

        System.out.println("employeeMap = " + employeeMap);


        */
        
        
        
        // itterate it with each entry 
//getValue gives u the value
        for (Map.Entry<String, String> entry : employeeMap.entrySet()) {

          //  System.out.println("entry = " + entry);

            if(entry.getValue().equalsIgnoreCase("m")){
                entry.setValue("Male");
            }


            if(entry.getValue().equalsIgnoreCase("F")){
                entry.setValue("Female");
            }

        }

        System.out.println("employeeMap = " + employeeMap);


        System.out.println("-----------------------------");
        //  //  2. Display the names of all female employees

        for (Map.Entry<String, String> eachPair : employeeMap.entrySet()) {
            String eachkey = eachPair.getKey();
            String eachValue = eachPair.getValue();


            if(eachValue.equals("Female")){// key reprsent name of female
                System.out.println(eachkey);
            }

        }

        
    }




}
