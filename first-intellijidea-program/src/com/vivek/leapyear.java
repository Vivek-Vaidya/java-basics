package com.vivek;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year;
        System.out.print("Enter the year : ");
        year = in.nextInt();
        if(year%4 == 0) {
            System.out.println(year + " is the leap Year");
        }else
            System.out.println(year + " is not the leap Year");
    }
}
