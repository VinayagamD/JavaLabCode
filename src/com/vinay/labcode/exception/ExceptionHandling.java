package com.vinay.labcode.exception;

public class ExceptionHandling {

    public static void main(String[] args) {
        int a = 10, b=5, c = 5, x,y;
        try{
            x = a/(b-c);
            System.out.println("x= "+x);
        }catch (ArithmeticException e){
            System.err.println("DIVISION BY ZERO");
        }
        y = a/(b+c);
        System.out.println("y= "+y);
    }
}
