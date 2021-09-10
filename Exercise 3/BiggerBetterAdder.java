package com.sg.foundations.userinput;

import java.util.Scanner;

public class BiggerBetterAdder {
    public static void main(String[] args) {
        int a, b, c;
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("Enter first number:");
        a = Integer.parseInt(inputReader.nextLine());
        System.out.println("Enter second number:");
        b = Integer.parseInt(inputReader.nextLine());
        System.out.println("Enter third number:");
        c = Integer.parseInt(inputReader.nextLine());
        
        System.out.println(a+" + "+b+" + "+c+" = "+(a+b+c));
    }
}
