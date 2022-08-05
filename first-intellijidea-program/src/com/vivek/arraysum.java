package com.vivek;

import java.util.Scanner;

public class arraysum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int x = in.nextInt();
        int sum = 0;
        int array[] = new int[x];


        System.out.print("Enter the " + x +" Numbers : ");
        for (int i = 0; i <= x; i++) {
            array[i] = in.nextInt();
        }
         sum = sum(array);
        System.out.println("The sum of the " + x + " numbers : " + sum );

    }
    static int sum(int arr[])
    {
        int sum = 0; // initialize sum
        int i;

        // Iterate through all elements and add them to sum
        for (i = 0; i < arr.length; i++)
            sum += arr[i];

        return sum;
    }
}
