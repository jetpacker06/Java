package com.jetpacker06.java;
import java.util.Scanner;
public class FindArea {
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
}