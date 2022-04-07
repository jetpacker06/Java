package com.jetpacker06.java;

public class TeachToCountToTen {
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
}
