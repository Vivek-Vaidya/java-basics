package com.vivek;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a , b, sum;
        System.out.print("Enter the two number : ");
        a = input.nextInt();
        b = input.nextInt();
        sum = a + b;
        System.out.println("Sum to two numbers : " + sum);

    }
}
