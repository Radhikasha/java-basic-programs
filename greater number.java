//package com.company;
public class Main{
    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        int c = 10;
        if(a>=b && a>=c)
            System.out.println("largest number is:"+a);
        else if (b>=a && b>=c)
            System.out.println("largest number is:"+b);
        else
            System.out.println("largest number is:"+c);

    }
}