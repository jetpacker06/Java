package com.jetpacker06.java;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean dontexit = true;
        do {
            System.out.println("Enter the number that corresponds to the program you would like to run.");
            String[] programsArrayList = {"1. Exit program", "2. Number Matcher", "3. Average/Mean Absolute Deviation Calculator", "4. Area Calculator", "5. Celsius to Fahrenheit", "6. Fahrenheit to Celsius", "7. I Teach Myself To Count", "8. CraftTweaker script generator"};
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
                    RollDiceUntilComboReached.rollDice();
                    break;
                case "3":
                    FindAverage.findAverage();
                    break;
                case "4":
                    FindArea.findArea();
                    break;
                case "5":
                    TemperatureConvert.cToF();
                    break;
                case "6":
                    TemperatureConvert.fToC();
                case "7":
                    TeachToCountToTen.teachToCountToTen();
                    break;
                case "8":
                    RecipeGen.pickRecipeType();
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