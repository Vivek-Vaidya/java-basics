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

   static int HCF (int u, int v) {
       int hcf = 0;
       for (int i = 1; i <= u || i <= v; i++) {
           if (u%i == 0 && v%i == 0)
               hcf = i;
       }
       return hcf;

   }

    public static void main(String[] args) {
        int a, b;
        System.out.print("Enter the two numbers : ");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        System.out.println("lcm of the Entered Numbers is : " + LCM(a,b));
        System.out.println("hcf of the Entered Numbers is : " + HCF(a, b));

    }
}
