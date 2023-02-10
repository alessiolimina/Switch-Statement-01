package it.develhope.switchstatement;

/**
 * This class is a Tester class
 * @author alessiolimina
 */

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        /**
         * Creating an infinite WHILE loop
         */

        while (true) {

            System.out.println("Welcome! Please, type a number between 1 and 10!");

            /**
             * Declaring the variables
             */

            Scanner scanner = new Scanner(System.in);
            int userNumber = scanner.nextInt();

            /**
             * Using a SWITCH statement to verify and print the typed number
             */

            switch (userNumber) {
                case 1:
                    System.out.println("The number is one");
                    break;
                case 2:
                    System.out.println("The number is two");
                    break;
                case 3:
                    System.out.println("The number is three");
                    break;
                case 4:
                    System.out.println("The number is four");
                    break;
                case 5:
                    System.out.println("The number is five");
                    break;
                case 6:
                    System.out.println("The number is six");
                    break;
                case 7:
                    System.out.println("The number is seven");
                    break;
                case 8:
                    System.out.println("The number is eight");
                    break;
                case 9:
                    System.out.println("The number is nine");
                    break;
                case 10:
                    System.out.println("The number is ten");
                    break;
                default:
                    System.out.println("Cannot give you the name");}

            System.out.println("----------------------------------");

            }
        }
    }



