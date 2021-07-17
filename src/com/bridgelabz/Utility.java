package com.bridgelabz;

import java.util.Scanner;

public class Utility {

    /**
     * Scanner which can parse primitive types and strings
     */
    static final Scanner scan = new Scanner(System.in);
    /**
     * Scanning of User input which is integer type
     * @return assigned integer value
     */
    public static char getUserChar() {
        // this is for character

        return scan.next().charAt(0);
    }

    public static int getUserInteger()          // this is for integer or numbers
    {
        return scan.nextInt();
    }
}
