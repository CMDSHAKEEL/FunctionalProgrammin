package com.bridgelabz;

import java.util.Scanner;

public class FibonacciSeries {
    /*
     * here the main class start
     * importing integer from utility class
     */
    public static void main(String[] args) {

        System.out.println("Enter the range: ");

        int range =  Utility.getUserInteger();
        fibonacciSeries(range);

    }

    public static void fibonacciSeries(int range) {

        int a = 0, b = 1;
        if (range == 0)
            System.out.println(a);

        int i = 2;
        while (i <= range) {

            int c = a + b;
            a = b;
            b = c;
            System.out.println(b);
            i++;

        }
    }
}
