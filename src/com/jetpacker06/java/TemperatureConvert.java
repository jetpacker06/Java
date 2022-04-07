package com.jetpacker06.java;

import java.util.Scanner;

public class TemperatureConvert {
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
}
