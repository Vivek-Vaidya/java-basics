package com.vivek;

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        System.out.print("Enter the number : ");
        a = in.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i*a);
        }
    }
}
