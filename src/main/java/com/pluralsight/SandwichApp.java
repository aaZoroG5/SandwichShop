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
        double price;

        //create an if statement that displays the price of size chosen, either 1 or 2
        if(size == 1){
            price = 5.45; //I MADE THE MISTAKE OF DECLARING 'DOUBLE PRICE' IN EACH STATEMENT, INSTEAD CREATE THE PRICE VARIABLE ONCE OUTSIDE THE STATEMENT SO I CAN CALL IT LATER
        }
        else if (size == 2) {
            price = 8.95;
        }
        else {
            System.out.print("Invalid option, choose 1 or 2");
            swScanner.close();
            return; //QUESTION: WHAT DOES RETURN AND CLOSE DO? I WAS ABLE TO INITIALIZE 'PRICE' ONCE I ADDED THESE COMMANDS
        }
        System.out.printf("The price before the discount is $%.2f ", price);

        System.out.println();
        //ask the user if they want a loaded sandwich (y/n) and give the two options
        System.out.print("Do you want a loaded sandwich?(Y / N) ");

        //fix buffer
        swScanner.nextLine();
        //create scanner that stores y/n variable
        String loadSandwich = swScanner.nextLine();

        //create an if statement that gives the loaded options yes or no
        if(loadSandwich.equals("y") || loadSandwich.equals("Y")){

            //ask for a regular or large load
            System.out.print("Would you like regular or large loaded? ");

            //create a variable that stores the type of load in the scanner
            String typeOfLoad = swScanner.nextLine();

            //create an if statement that gives the options of regular or large load
            if(typeOfLoad.equals("regular")){
                double regLoaded = 1.00;
                double sum = price + regLoaded;
                System.out.printf("New price: $%.2f", sum);
            }
            else if(typeOfLoad.equals("large")){
                double largeLoaded = 1.75;
                double sum = price + largeLoaded;
                System.out.printf("New price: $%.2f", sum);
            }
            else{
                System.out.println("Invalid option, choose regular or large");
            }
        }
        else if(loadSandwich.equals("n") || loadSandwich.equals("N")){
            System.out.printf("Price: $%.2f", price);
        }

        System.out.println();
        //ask the user for their age
        System.out.print("What is your age? ");

        //create scanner to store the age of the user
        int age = swScanner.nextInt();

        //create if statements with age conditions for discounts
        if(age <= 17){
            double discount = price * .90;
        }
        else if(age >= 65){
            double discount = price * .80;
        }
        else{
            System.out.println("Invalid input");
        }
        System.out.printf("Final price: $%.2f", price);
    }

}
