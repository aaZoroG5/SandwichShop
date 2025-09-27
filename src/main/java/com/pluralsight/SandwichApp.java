package com.pluralsight;

import java.util.Scanner;

public class SandwichApp {

    public static void main(String[] args) {

        //create a scanner to read user input
        Scanner swScanner = new Scanner(System.in);

        //ask the user if they want the size of the sandwich to be 1 or 2
        System.out.print("Do you want a size 1 or 2 sandwich? " );

        // scanner saves user input under the variable size
        int size = swScanner.nextInt();

        //create an if statement that displays the price of size chosen, either 1 or 2
        if(size == 1){
            double price = 5.45;
            System.out.printf("The price before the discount is $%.2f ", price);
        }
        else if (size == 2) {
            double price = 8.95;
            System.out.printf("The price before the discount is $%.2f ", price);
        }
        else {
            System.out.print("Invalid option, choose 1 or 2");
        }

        System.out.println();
        //ask the user if they want a loaded sandwich (y/n) and give the two options
        System.out.print("Do you want a loaded sandwich?(Y / N) ");

        //fix buffer
        swScanner.nextLine();
        //create scanner that stores y/n variable
        String loadSandwich = swScanner.nextLine();

        //create an if statement that gives the loaded options and another that doesn't add anything
        if(loadSandwich.equals("y") || loadSandwich.equals("Y")){

            //ask for a regular or large load
            System.out.print("Would you like regular or large loaded? ");

            //create a variable that stores the type of load in the scanner
            String typeOfLoad = swScanner.nextLine();
            double regLoaded = 1.00;
            double largeLoaded = 1.75;
        }
        else if(loadSandwich.equals("n") || loadSandwich.equals("N")){
            System.out.println("Price: ");//+ price); // HOW DO I CALL PRICE HERE???
        }

    }

}
