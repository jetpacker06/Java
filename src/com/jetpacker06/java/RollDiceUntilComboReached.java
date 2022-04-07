package com.jetpacker06.java;
import java.util.Scanner;
public class RollDiceUntilComboReached {
    public static void rollDice (){
        int rollOne = 0, rollTwo = 0, attempts = 0, firstTarget, secondTarget;
        Scanner rollDiceScanner = new Scanner(System.in);
        System.out.println("You will enter two numbers, each between 1 and 10, and two random numbers 1 - 10 will be generated until the numbers respectively match the inputs.");
        System.out.println("Enter a one digit number.");
        firstTarget = Integer.parseInt(rollDiceScanner.nextLine());
        System.out.println("Enter another one digit number.");
        secondTarget = Integer.parseInt(rollDiceScanner.nextLine());

        do {
            rollOne = (int)(Math.random() * 10);
            rollTwo = (int)(Math.random() * 10);
            attempts++;
            System.out.println(rollOne + " " + rollTwo);
            if (rollOne == firstTarget & rollTwo == secondTarget) {break;}
        } while (rollOne != firstTarget || rollTwo != secondTarget);
        System.out.println("Success!");
        System.out.println(" It took " + attempts + " attempts to match the numbers.");


    }
}
