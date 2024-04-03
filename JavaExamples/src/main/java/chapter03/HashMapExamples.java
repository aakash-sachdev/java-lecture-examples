package chapter03;


import java.util.HashMap;

public class HashMapExamples {

    public static void main(String[] args) {

        /* CREATING A HASHMAP AND ADDING KEY/VALUE PAIRS */

        // TODO: Declare an empty HashMap, add key/value pairs, and print the map

        // Create a map, superheroAges, that can hold String keys and Integer values
        HashMap<String, Integer> superheroAges = new HashMap<>();

        // Add 4 key/value pairs to it representing the elves and their ages
        superheroAges.put("Batman", 38);
        superheroAges.put("Spiderman", 21);
        superheroAges.put("Superman", 36);
        superheroAges.put("Ironman", 31);

        // Print the map
        System.out.println(superheroAges);
        System.out.println("*****************************************************************************************");


        /* HASHMAP METHODS */

        // TODO: Practice using different methods of the HashMap class

        // Print the size
        System.out.println(superheroAges.size());
        System.out.println("*****************************************************************************************");

        // Print the entry set
        System.out.println(superheroAges.entrySet());
        System.out.println("*****************************************************************************************");

        // Print just the key set
        System.out.println(superheroAges.keySet());
        System.out.println("*****************************************************************************************");


        // Print just the values
        System.out.println(superheroAges.values());
        System.out.println("*****************************************************************************************");

        // Check if it contains a certain key and print result
        System.out.println(superheroAges.containsKey("Spiderman"));
        System.out.println("*****************************************************************************************");

        // Check if it contains a certain value and print result
        System.out.println(superheroAges.containsValue(5000));
        System.out.println("*****************************************************************************************");
    }
}
