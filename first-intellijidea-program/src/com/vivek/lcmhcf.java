package com.vivek;

import java.util.Scanner;

public class lcmhcf {
   static int GDC (int u, int v) {
       if (u == 0)
           return v;
       return GDC(v% u, u);
   }

   static int LCM(int u, int v) {
       return (u / GDC(u, v)) * v;
   }

    public static void main(String[] args) {
        int a, b;
        System.out.print("Enter the two numbers : ");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        System.out.println("lcm of the Entered Numbers is : " + LCM(a,b));

    }
}
