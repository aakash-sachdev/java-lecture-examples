package chapter02;

// TODO: import Scanner from java.util
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* PRINTING TO THE CONSOLE */

        // TODO: Use System.out to print to the console
        System.out.println("Let's start learning Java!!");


        /* DECLARING AND INITIALIZING VARIABLES */
        // TODO: Declare and initialize several variables and print them to the console

        String newFaveGame = "Spider-Man 2";
        String faveVillain = "Venom";
        String faveHero = "Peter Parker";
        String gamePlayTime = "20 hours.";

        System.out.println("My new favourite game is " + newFaveGame + ", main boss in the game is " + faveVillain + ". My favourite sup in the game is " + faveHero + " and the gameplay for" + newFaveGame + " is " + gamePlayTime);
        System.out.println("***********************************************************************************************************************************");

        int roundNumber = 9;//        float decimalNum = 1.345;
        float aNewDecimal = 4.65f;
        float diffDecNum  = (float) 3.857;
        double largeNum = 13.84863;
        boolean isOdd = true;

        System.out.println(roundNumber);
        System.out.println(aNewDecimal);
        System.out.println(diffDecNum);
        System.out.println(largeNum);
        System.out.println(isOdd);
        System.out.println("***********************************************************************************************************************************");


        /* WRITING METHODS */

        // TODO: After coding your method below main(), call it here and print the result

        System.out.println( getFullName("Aakash", "Sachdev"));
        System.out.println("***********************************************************************************************************************************");

        /* USING METHODS FROM OTHER CLASSES */

        // TODO: Call each of the static methods from the Examples class
        Examples.sayHello("Emily");
        System.out.println(Examples.addThreeNums(4, 6, 5));
        System.out.println("***********************************************************************************************************************************");

        /* USING SCANNER TO GET USER INPUT */

        // TODO: Declare and initialize a Scanner object using System.in
        Scanner input = new Scanner(System.in);

        // TODO: Get user input
        // Precede your input with output to the user so they know what you need
        System.out.print("Enter a whole number: ");

        // Receive the input and store it in a variable
        int userNum = input.nextInt();

        // Do something with the stored user input
        System.out.println("Your input number is: " + userNum);
        System.out.println("***********************************************************************************************************************************");

        // String Example -
        System.out.print("Enter your name: ");
        String userName = input.next();
        System.out.println("Thanks," + userName+ "!");

        // Always close the Scanner object at the end of the main method
        // for efficiency and security
        // TODO: Close Scanner
        input.close();
        System.out.println("***********************************************************************************************************************************");
    }

    // TODO: Code a method to return a full name as a String using firstName and lastName
    public static String getFullName (String firstName, String lastName) {
        return firstName + " " + lastName;
    }

}