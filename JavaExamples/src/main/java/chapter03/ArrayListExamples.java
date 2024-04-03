package chapter03;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExamples {

    public static void main(String[] args) {

        /* DECLARING ARRAYLISTS */

        // TODO: Declare two empty ArrayLists
        // superheros, for data of type String
        // ages, for data of type Integer
        ArrayList<String> superheros = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        /* ADDING ELEMENTS TO ARRAYLISTS */

        // TODO: Add elements to each of arraylists above

        // 4 well-known superheros
        superheros.add("Batman");
        superheros.add("Spiderman");
        superheros.add("Superman");
        superheros.add("Ironman");

        // 4 ages of superheros above
        ages.add(38);
        ages.add(21);
        ages.add(36);
        ages.add(31);


        /* PRINTING ARRAYLISTS */

        // TODO: Print each arraylist
        System.out.println(superheros);
        System.out.println(ages);
        System.out.println("*****************************************************************************************");

        /* USING ARRAYLIST & COLLECTIONS METHODS */

        // TODO: Print the size of superheros
        System.out.println(superheros.size());
        System.out.println("*****************************************************************************************");

        // TODO: Check to see if ages contains 2901 and print the result+
        System.out.println(ages.contains(36));
        System.out.println("*****************************************************************************************");

        // TODO: Sort superheros and then print it
        Collections.sort(superheros);
        System.out.println(superheros);
        System.out.println("*****************************************************************************************");
        // And now the ages of the superheros are not in the same order...
        // We will fix this with HashMaps
    }
}
