package com.sg.foundations.userinput;

import java.util.Scanner;

public class DoItBetter {
    public static void main(String[] args) {
        int a1, a2, a3;
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("How many miles can you run?");
        a1 = Integer.parseInt(inputReader.nextLine());
        System.out.println("Well I can run "+(2*a1+1)+" miles!");
        System.out.println("How many hot dogs can you eat?");
        a2 = Integer.parseInt(inputReader.nextLine());
        System.out.println("Well I can eat "+(2*a2+1)+"!");
        System.out.println("How many languages do you know?");
        a3 = Integer.parseInt(inputReader.nextLine());
        System.out.println("Well I know "+(2*a3+1)+"!");
    }
}
