package chapter03;

import java.util.HashMap;
import java.util.Scanner;

public class ConditionalExamples {

    public static void main(String[] args) {

        /* EQUALITY & LOGICAL OPERATORS */

        // TODO: Print several boolean expressions using different operators with the specified types

        // 6 is not equal to 3 + 4
        System.out.println( 6 != 3 + 4);
        System.out.println("*****************************************************************************************");

        // 8.146 is greater than or equal to 10
        System.out.println(8.146 >= 10);
        System.out.println("*****************************************************************************************");

        // "LaunchCode" is equal to "launchcode" if case-insensitive
        System.out.println("LaunchCode".toLowerCase().equals("launchcode"));
        System.out.println("*****************************************************************************************");

        // 15 is greater than 10 AND is less than or equal to 20
        System.out.println(15 > 10 && 15 <= 20);
        System.out.println("*****************************************************************************************");

        // "fellowship" contains the substring "boat" OR "ship"
        System.out.println("fellowship".contains("boats") || "fellowship".contains("ship") );
        System.out.println("*****************************************************************************************");

        /* IF, ELSE-IF, AND ELSE */

        // TODO: Open a scanner for user input
        Scanner input = new Scanner(System.in);

        // TODO: Store information about a city in a map

        // Create a HashMap with String key and String value
        HashMap<String, String> noble = new HashMap<>();

        // Prompt the user for a name
        System.out.println("Please enter the name of a noble:");
        String nobleName = input.nextLine();

        // Store the name in the map
        noble.put("name", nobleName);

        // Declare (but do not initialize) a String, title
        String title;

        // Construct a series of if/else-if/else blocks to initialize the title
        //   Eomer becomes King of Rohan
        //   Eowyn becomes Lady of Ithilien
        //   Aragorn becomes King of Gondor

        if (nobleName.equals("Eomer")) {
            title = "King of Rohan";
        } else if (nobleName.equals("Eowyn")) {
            title = "Lady of Ithilien";
        } else if (nobleName.equals("Aragorn")){
            title = "King of Gondor";
        } else {
            System.out.println("Sorry, I do not have information on that noble.");
            title = null;
        }

        // Set the title into the map
        noble.put("title", title);

        // Print the map
        System.out.println(noble);
        System.out.println("*****************************************************************************************");

        // Print a sentence using the noble's name and title
        System.out.println(noble.get("name") + " is " + noble.get("title"));
        System.out.println("*****************************************************************************************");


        // Don't close scanner yet

        /* SWITCH STATEMENTS */

        // TODO: Store information about a elf in a map

        // Create a HashMap with String key and String value
        HashMap<String, String> superhero = new HashMap<>();

        // Prompt the user for a name
        System.out.println("Please enter the name of an superhero:");
        String superheroName = input.nextLine();

        // Store the name in the map
        superhero.put("name", superheroName);

        // Declare (but do not initialize) a String, game
        String game;

        // Construct a switch statement to initialize the game
        //   Game for Batman is the Arkham City
        //   Game for Spiderman is Spiderman-2
        //   Game for Superman is SuperWorld (not a game)

        switch (superheroName) {
            case "Batman":
                game = "Arkham City";
                break;

            case "Spiderman":
                game = "Spiderman-2";
                break;

            case  "Superman":
                game = "SuperWorld (not a game)";
                break;

            default:
                System.out.println("Sorry, please check on google.");
                game = null;
        }


        // Set the game into the map
        superhero.put("game", game);

        // Print the map
        System.out.println(superhero);
        System.out.println("*****************************************************************************************");

        // Print a sentence using the elf's name and realm
        System.out.println("Game for " + superhero.get("name") + " is " + superhero.get("game"));
        System.out.println("*****************************************************************************************");

        // TODO: Close the scanner
        input.close();
    }

}
