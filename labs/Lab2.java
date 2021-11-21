package com.shkilo;
import java.util.Scanner;

public class Lab2 {

    public static void printText(String text) {
        System.out.println(text);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        printText("Enter the number");
        int n = in.nextInt();
        int fact = 1;
        for (int i = 2;i <= n;i++)
        {
            fact = fact * i;
        }

        int fact2 = 1;
        int i = 2;
        while (i <= n) {
            fact2 = fact2 * i;
            i++;
        }

        System.out.printf("The factorial is - %d(for), %d(while)", fact, fact2);

    }
}
