package com.company;
public class Main{
    public static void main(String[] args) {
        int a = 30;
        boolean flag = false;
        for(int i = 2;i<=a/2;++i){
            if(a%i==0)
                flag = true;
                break;

        }
        if(!flag)
            System.out.println(" number is prime");
        else
            System.out.println("number is not prime");
    }
}
