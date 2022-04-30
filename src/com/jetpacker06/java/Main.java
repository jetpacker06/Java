package com.jetpacker06.java;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean dontexit = true;
        do {
            System.out.println("Enter the number that corresponds to the program you would like to run.");
            String[] programsArrayList = {
                    "1. Exit program",
                    "2. Number Matcher",
                    "3. Average/Mean Absolute Deviation Calculator",
                    "4. Area Calculator",
                    "5. Celsius to Fahrenheit",
                    "6. Fahrenheit to Celsius",
                    "7. I Teach Myself To Count",
                    "8. CraftTweaker script generator",
                    "9. Calculate an exponent"
            };
            for (int i = 0; i < programsArrayList.length; i++) {
                System.out.println(programsArrayList[i]);
            }
            String programSelection;
            Scanner programSelectionScannerObject = new Scanner(System.in);
            programSelection = programSelectionScannerObject.nextLine();
            switch (programSelection) {
                case "1":
                    dontexit = false;
                    break;
                case "2":
                    Methods.rollDice();
                    break;
                case "3":
                    Methods.findAverage();
                    break;
                case "4":
                    Methods.findArea();
                    break;
                case "5":
                    Methods.cToF();
                    break;
                case "6":
                    Methods.fToC();
                    break;
                case "7":
                    Methods.teachToCountToTen();
                    break;
                case "8":
                    Methods.pickRecipeType();
                case "9":
                    Methods.exponentCalc();
                    break;
                default:
                    System.out.println("Invalid input.");
            }
            if (dontexit) {
                System.out.println(".");
                System.out.println(".");
                System.out.println(".");
            }
        } while (dontexit);
    }
}