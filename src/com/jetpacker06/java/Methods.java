package com.jetpacker06.java;

import java.util.Scanner;

public class Methods {
    public static void pickRecipeType() {
        P.s("Enter the number of your desired recipe type.");
        String[] recipeTypesList = {"5. Melting"};
        for (int i = 0; i < recipeTypesList.length; i++) {
            P.s(recipeTypesList[i]);
        }
        Scanner typeScanner = new Scanner(System.in);
        switch (typeScanner.nextLine()) {
            case "5":
                Methods.genMelting();
                break;
        }
    }
    public static void genMelting() {

        Scanner inputScanner = new Scanner(System.in);
        P.s("Enter the item you want to melt in the following format: minecraft:stick");
        String meltingItem = inputScanner.nextLine();
        P.s("Enter your desired output fluid in the following format: minecraft:water");
        String[] resultFluid = {inputScanner.nextLine(), "0"};
        P.s("Amount of mb (1 bucket = 1000 mb):");
        resultFluid[1] = inputScanner.nextLine();
        P.s("Enter the required temperature. Lava is 1000, Blazing Blood is 1500, most are 1000.");
        int temp = inputScanner.nextInt();
        P.s("Enter the duration in ticks, 20 ticks is one second.");
        int duration = inputScanner.nextInt();
        P.s("Foundry byproduct? Y or N");
        boolean hasByproduct = inputScanner.nextLine().toLowerCase() == "y";
        if (hasByproduct) {
            hasByproduct = true;
            P.s("Enter your desired byproduct fluid in the following format: minecraft:water");
            String[] byproductFluid = {inputScanner.nextLine(), "0"};
            P.s("Amount of mb (1 bucket = 1000 mb):");
            byproductFluid[1] = inputScanner.nextLine();

            System.out.println(
                    "<recipetype:tconstruct:melting>.addMeltingRecipe(\"" + (int)(Math.random() * 10.1) + "\", <item:" + meltingItem + ">, <fluid:" + resultFluid[0] + "> * " + resultFluid[1]
            );
        }
    }
    public static void findArea() {
        float base1, base2, length, height, radius, diameter, result1, result2, result3;
        float pi = (float)Math.PI;
        Scanner InputScanner = new Scanner(System.in);
        String[] listOfShapes = {"1. Triangle", "2. Trapezoid", "3. Circle from radius", "4. Circle from diameter", "5. Rectangle"}; //add shapes the same way in main
        for (int i = 0; i < listOfShapes.length; i++) {
            System.out.println(listOfShapes[i]);
        }
        switch (InputScanner.nextLine()) {
            case "1": //triangle base and height
                System.out.println("Enter the base of your triangle.");
                base1 = InputScanner.nextFloat();
                System.out.println("Enter the height of your triangle.");
                height = InputScanner.nextFloat();
                result1 = 0.5f * base1 * height;
                P.f(result1);
                break;

            case "2": //trapezoid base1 base2 height
                P.s("Enter the first base of your trapezoid.");
                base1 = InputScanner.nextFloat();
                P.s("Enter the second base of your trapezoid.");
                base2 = InputScanner.nextFloat();
                P.s("Enter the height of your trapezoid.");
                height = InputScanner.nextFloat();
                result1 = base1 + base2;
                result2 = result1 / 2;
                result3 = result2 * height;
                P.f(result3);
                break;

            case "3": // circle radius
                P.s("Enter the radius of your circle.");
                radius = InputScanner.nextFloat();
                result1 = radius * radius;
                result2 = result1 * pi;
                P.f(result2);
                break;

            case "4": // circle diameter
                P.s("Enter the diameter of your circle.");
                diameter = InputScanner.nextFloat();
                radius = diameter / 2;
                result1 = radius * radius;
                result2 = result1 * pi;
                P.f(result2);
                break;

            case "5": //Rectangle length height
                P.s("Enter the length of your rectangle.");
                length = InputScanner.nextFloat();
                P.s("Enter the height of your rectangle");
                height = InputScanner.nextFloat();
                result1 = length * height;
                P.f(result1);
                break;
        }
    }
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
    public static void teachToCountToTen() {
        int d1 = 0, d2 = 0, d3 = 0, d4 = 0, d5 = 0, d6 = 0, d7 = 0, d8 = 0, d9 = 0, d10 = 0, count = 0;
        do {
            count++;
            if (d1 != 1)  {d1 = (int)(Math.random() * 10.1);}
            if (d2 != 2)  {d2 = (int)(Math.random() * 10.1);}
            if (d3 != 3)  {d3 = (int)(Math.random() * 10.1);}
            if (d4 != 4)  {d4 = (int)(Math.random() * 10.1);}
            if (d5 != 5)  {d5 = (int)(Math.random() * 10.1);}
            if (d6 != 6)  {d6 = (int)(Math.random() * 10.1);}
            if (d7 != 7)  {d7 = (int)(Math.random() * 10.1);}
            if (d8 != 8)  {d8 = (int)(Math.random() * 10.1);}
            if (d9 != 9)  {d9 = (int)(Math.random() * 10.1);}
            if (d10 != 10)  {d10 = (int)(Math.random() * 10.1);}
            System.out.println(d1 + ", " +d2 + ", " +d3 + ", " +d4 + ", " +d5 + ", " +d6 + ", " +d7 + ", " +d8 + ", " +d9 + ", " +d10);
        } while (d1 != 1 || d2 != 2 || d3 != 3 || d4 != 4 || d5 != 5 || d6 != 6 || d7 != 7 || d8 != 8 || d9 != 9 || d10 != 10);
        System.out.println("It took me " + count +" tries to learn to count to 10.");
    }
    public static void cToF() {
        Scanner temperatureScanner = new Scanner(System.in);
        P.s("Enter a temperature in Celsius.");
        float celsiusNumber = temperatureScanner.nextFloat();
        celsiusNumber = celsiusNumber * 9;
        celsiusNumber = celsiusNumber / 5;
        celsiusNumber = celsiusNumber + 32;
        P.f(celsiusNumber);
    }
    public static void fToC() {
        Scanner temperatureScanner = new Scanner(System.in);
        P.s("Enter a temperature in Fahrenheit.");
        float fahrenheitNumber = temperatureScanner.nextFloat();
        fahrenheitNumber = fahrenheitNumber - 32;
        fahrenheitNumber = fahrenheitNumber * 5;
        fahrenheitNumber = fahrenheitNumber / 9;
        P.f(fahrenheitNumber);
    }
    public static void exponentCalc() {
        float base, result = 1;
        int exponent;
        Scanner sc = new Scanner(System.in);
        P.s("Enter the base.");
        base = sc.nextFloat();
        P.s("Enter the exponent.");
        exponent = sc.nextInt();
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        P.f(result);
    }
}
