package com.bridgelabz;

public class StopWatch {
    public static int START = 0;
    public static int STOP = 0;

    public static void main(String[] args) {

        System.out.println("Welcome to StopWatch Simulation Program ");
        timerInMilliSeconds();

    }
    /*
    * here the main class start
    * importing integr from utility class
     */

    public static void timerInMilliSeconds() {

        long startTime = 0;
        long endTime = 0;

        System.out.println("Press 0 to start the time : ");
        int startInput =  Utility.getUserInteger();

        if (startInput == START)
            startTime = System.nanoTime();

        System.out.println("Press 1 to stop the time : ");
        int endInput =  Utility.getUserInteger();

        if (endInput == STOP)
            endTime = System.nanoTime();

        long timeElapsed = endTime - startTime;

        System.out.println("Time elapsed is : " + timeElapsed + " milliseconds");
    }
}
