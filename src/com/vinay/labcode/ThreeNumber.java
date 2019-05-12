package com.vinay.labcode;

import java.util.Scanner;

public class ThreeNumber {

    public static void main(String[] args) {
        int a , b, c;
        System.out.println("Enter A , B & C values");
        Scanner s = new Scanner(System.in);

        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();

        if((a>b)&&(a>c))
            System.out.println("A is BIG");
        else if((b>c))
            System.out.println("B is BIG");
        else
            System.out.println("C is BIG");
    }
}
