package com.jetpacker06.java;
import java.util.Scanner;
public class FindAverage {
    public static void  findAverage() {
        Scanner numberOfInputsScanner = new Scanner(System.in);
        Scanner numberScanner = new Scanner(System.in);
        System.out.println("Enter the amount of numbers you need to add.");
        float[] listOfNumbers;
        int numberOfInputs = numberOfInputsScanner.nextInt();
        listOfNumbers = new float[numberOfInputs + 1];
        float placeholder;
        float totalSum = 0f;
        for (int i = 0; i < numberOfInputs; i++) {
            System.out.println("Enter a number");
            placeholder = numberScanner.nextFloat();
            totalSum = totalSum += placeholder;
            listOfNumbers[i] = placeholder;
        }
        System.out.println("Sum: " + totalSum);
        //numberOfInputs += -1;
        float floatVersionOfSum = totalSum;
        float average = floatVersionOfSum / numberOfInputs;
        System.out.println("Average: " + floatVersionOfSum / numberOfInputs);//Print final average result
        //mean absolute deviation time :)
        float[] listOfDifferences = new float[numberOfInputs + 1];
        for (int i = 0; i < numberOfInputs; i++) {
            // System.out.println(listOfNumbers[i]);
            listOfDifferences[i] = Math.abs(average - listOfNumbers[i]);
        }
        float sumOfDifferences = 0;
        for (int i = 0; i < numberOfInputs; i++) {
            sumOfDifferences += listOfDifferences[i];
        }
        System.out.println("Mean Absolute Deviation: " + sumOfDifferences / numberOfInputs);
    }
}