package com.jetpacker06.java;

import java.util.Scanner;

public class RecipeGen {
    public static void pickRecipeType() {
        P.s("Enter the number of your desired recipe type.");
        String[] recipeTypesList = {"5. Melting"};
        for (int i = 0; i < recipeTypesList.length; i++) {
            P.s(recipeTypesList[i]);
        }
        Scanner typeScanner = new Scanner(System.in);
        switch (typeScanner.nextLine()) {
            case "5":
                RecipeGen.genMelting();
                break;
        }
    }
    public static void genMelting() {
        boolean hasByproduct = false;
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
        if (inputScanner.nextLine().toLowerCase() == "y") {
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
}